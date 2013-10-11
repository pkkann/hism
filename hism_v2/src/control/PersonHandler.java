/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Enrollment;
import entity.Person;
import java.util.ArrayList;
import model.EnrollmentRegister;
import model.PersonRegister;

/**
 *
 * @author patrick
 */
public class PersonHandler implements HismHandler {

    private PersonRegister peR;
    private EnrollmentRegister enR;

    public PersonHandler(PersonRegister peR, EnrollmentRegister enR) {
        this.peR = peR;
        this.enR = enR;
    }

    /**
     * Create a person
     *
     * @param firstname
     * @param middlename
     * @param lastname
     * @param address
     * @param birthdayDate (DD/MM/YYYY)
     * @param expirationDate (MM/YYYY)
     * @param creationDate (DDMMYYYY)
     * @param hoene
     * @param reserve
     * @param oneOne
     * @param picturePath
     * @return Error code : Integer
     */
    public int createPerson(String firstname, String middlename, String lastname, String address, String birthdayDate, String expirationDate, String creationDate, boolean hoene, boolean reserve, boolean oneOne, String picturePath) {

        // Check fields are filled
        if (firstname.isEmpty() || lastname.isEmpty() || address.isEmpty() || birthdayDate.isEmpty() || expirationDate.isEmpty() || creationDate.isEmpty() || picturePath.isEmpty()) {
            return FIELDS_NOT_FILLED_ERROR;
        }

        // Check birthday is written correctly
        String[] birth_Split = birthdayDate.split("/");
        String birth_Day = birth_Split[0];
        String birth_Month = birth_Split[1];
        String birth_Year = birth_Split[2];

        if (birth_Day.length() != 2 || birth_Month.length() != 2 || birth_Year.length() != 4) {
            return BIRTHDAY_FORMAT_ERROR;
        }

        // Check expiration is written correctly
        String[] expire_Split = expirationDate.split("/");
        String expire_Month = expire_Split[0];
        String expire_Year = expire_Split[1];

        if (expire_Month.length() != 2 || expire_Year.length() != 4) {
            return EXPIRATION_FORMAT_ERROR;
        }

        // Check picturepath
        if (picturePath.isEmpty()) {
            return PICTUREPATH_EMPTY_ERROR;
        }

        // Create person
        Person p = new Person(firstname, middlename, lastname, address, birthdayDate, expirationDate, creationDate, hoene, reserve, oneOne, picturePath);

        // Register person
        peR.registerPerson(p);

        return NO_ERROR;
    }

    /**
     * Save a person
     *
     * @param personID
     * @param firstname
     * @param middlename
     * @param lastname
     * @param address
     * @param birthdayDate (DD/MM/YYYY)
     * @param expirationDate (MM/YYYY)
     * @param reserve
     * @param hoene
     * @param oneOne
     * @param picturePath
     * @return Error code : Integer
     */
    public int savePerson(int personID, String firstname, String middlename, String lastname, String address, String birthdayDate, String expirationDate, boolean hoene, boolean reserve, boolean oneOne, String picturePath) {
        // Check fields are filled
        if (firstname.isEmpty() || lastname.isEmpty() || address.isEmpty() || birthdayDate.isEmpty() || expirationDate.isEmpty() || picturePath.isEmpty()) {
            return FIELDS_NOT_FILLED_ERROR;
        }

        // Check birthday is written correctly
        String[] birth_Split = birthdayDate.split("/");
        String birth_Day = birth_Split[0];
        String birth_Month = birth_Split[1];
        String birth_Year = birth_Split[2];

        if (birth_Day.length() != 2 || birth_Month.length() != 2 || birth_Year.length() != 4) {
            return BIRTHDAY_FORMAT_ERROR;
        }

        // Check expiration is written correctly
        String[] expire_Split = expirationDate.split("/");
        String expire_Month = expire_Split[0];
        String expire_Year = expire_Split[1];

        if (expire_Month.length() != 2 || expire_Year.length() != 4) {
            return EXPIRATION_FORMAT_ERROR;
        }

        // Check picturepath
        if (picturePath.isEmpty()) {
            return PICTUREPATH_EMPTY_ERROR;
        }

        // Set person
        Person p = peR.getPerson(personID);
        if (p == null) {
            return GET_ERROR;
        } else {
            p.setFirstname(firstname);
            p.setMiddlename(middlename);
            p.setLastname(lastname);
            p.setAddress(address);
            p.setBirthdayDate(birthdayDate);
            p.setExpirationDate(expirationDate);
            p.setHoene(hoene);
            p.setReserve(reserve);
            p.setOneOne(oneOne);
            p.setPicturePath(picturePath);
        }

        // Register person
        peR.savePerson(p);

        return NO_ERROR;
    }

    /**
     * Remove a person
     *
     * @param personID
     * @return Error code : Integer
     */
    public int removePerson(int personID) {
        Person p = peR.getPerson(personID);

        if (p == null) {
            return GET_ERROR;
        } else {
            peR.deletePerson(p);
        }

        return NO_ERROR;
    }

    /**
     * Returns number of enrolled persons
     *
     * @return count : Integer
     */
    public int getEnrolledCount() {
        int count = 0;

        for (Enrollment en : enR.getEnrollments()) {
            for (Person p : peR.getPersons()) {
                if (en.getEnrolledPerson().equals(p)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Returns a result based on a string
     * @param search
     * @return data : ArrayList<String[]>
     */
    public ArrayList<String[]> searchPerson(String search) {
        // Create collection
        ArrayList<String[]> data = new ArrayList<>();

        // Split string into words
        String[] sSplit = search.split(" ");

        // Do search
        if (search.isEmpty()) {
            for (Person p : peR.getPersons()) {
                String hoene = "Nej";
                if (p.isHoene()) {
                    hoene = "Ja";
                }
                String oneOne = "Nej";
                if (p.isOneOne()) {
                    oneOne = "Ja";
                }
                String reserve = "Nej";
                if (p.isReserve()) {
                    reserve = "Ja";
                }
                String[] dat = {String.valueOf(p.getIdPerson()), p.getFirstname() + " " + p.getMiddlename() + " " + p.getLastname(), p.getAddress(), p.getBirthdayDate(), p.getExpirationDate(), p.getCreationDate(), hoene, reserve, oneOne};
                data.add(dat);
            }
        } else {
            for (Person p : peR.getPersons()) {
                String birthday = p.getBirthdayDate().replaceAll("/", "");
                String expiration = p.getExpirationDate().replaceAll("/", "");
                String hoene = "Nej";
                if (p.isHoene()) {
                    hoene = "Ja";
                }
                String oneOne = "Nej";
                if (p.isOneOne()) {
                    oneOne = "Ja";
                }
                String reserve = "Nej";
                if (p.isReserve()) {
                    reserve = "Ja";
                }
                for (String s : sSplit) {
                    if (p.getFirstname().equalsIgnoreCase(s) || p.getMiddlename().equalsIgnoreCase(s) || p.getLastname().equalsIgnoreCase(s) || p.getAddress().equalsIgnoreCase(s) || p.getBirthdayDate().equalsIgnoreCase(s) || p.getExpirationDate().equalsIgnoreCase(s) || birthday.equalsIgnoreCase(s) || expiration.equalsIgnoreCase(s)) {
                        String[] dat = {String.valueOf(p.getIdPerson()), p.getFirstname() + " " + p.getMiddlename() + " " + p.getLastname(), p.getAddress(), p.getBirthdayDate(), p.getExpirationDate(), p.getCreationDate(), hoene, reserve, oneOne};
                        data.add(dat);
                        break;
                    }
                }
            }
        }

        return data;
    }

    /**
     * Returns a person based on an Integer
     *
     * @param id
     * @return p : Person
     */
    public Person getPerson(int id) {
        Person p = null;

        for (Person pp : peR.getPersons()) {
            if (pp.getIdPerson() == id) {
                p = pp;
                break;
            }
        }

        return p;

    }
}
