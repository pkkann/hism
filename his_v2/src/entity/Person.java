/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author patrick
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @Column(name = "idperson")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPerson;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "middlename")
    private String middlename;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "address")
    private String address;

    @Column(name = "birthdaydate")
    private String birthdayDate;

    @Column(name = "expirationdate")
    private String expirationDate;

    @Column(name = "creationdate")
    private String creationDate;

    @Column(name = "picturepath")
    private String picturePath;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email")
    private String email;

    @Column(name = "hoene")
    private boolean hoene;

    @Column(name = "reserve")
    private boolean reserve;

    @Column(name = "oneone")
    private boolean oneOne;
    
    private boolean expired;

    public Person() {
    }

    public Person(String firstname, String middlename, String lastname, String address, String email, String phone, String birthdayDate, String expirationDate, String creationDate, boolean hoene, boolean reserve, boolean oneOne) {
        this.oneOne = oneOne;
        this.reserve = reserve;
        this.hoene = hoene;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthdayDate = birthdayDate;
        this.expirationDate = expirationDate;
        this.creationDate = creationDate;
        this.expired = false;
    }

    public Person(String firstname, String middlename, String lastname, String address, String email, String phone, String birthdayDate, String expirationDate, String creationDate, boolean hoene, boolean reserve, boolean oneOne, String picturePath) {
        this.oneOne = oneOne;
        this.reserve = reserve;
        this.hoene = hoene;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthdayDate = birthdayDate;
        this.expirationDate = expirationDate;
        this.creationDate = creationDate;
        this.picturePath = picturePath;
        this.expired = false;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public boolean isHoene() {
        return hoene;
    }

    public void setHoene(boolean hoene) {
        this.hoene = hoene;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public boolean isOneOne() {
        return oneOne;
    }

    public void setOneOne(boolean oneOne) {
        this.oneOne = oneOne;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
    
    

}
