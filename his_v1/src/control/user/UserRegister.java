/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.user;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author patrick
 */
public class UserRegister {

    private ArrayList<User> users;

    public UserRegister() {
        users = new ArrayList<>();
    }
    
    public boolean isEmailFree(String email) {
        for(User u : users) {
            if(u.getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }
    
    public User checkUser(String email, String password) {
        for(User u : users) {
            if(u.getEmail().equalsIgnoreCase(email)) {
                if(u.getPassword().equals(password)) {
                    return u;
                }
            }
        }
        return null;
    }

    public int size() {
        return users.size();
    }

    public boolean isEmpty() {
        return users.isEmpty();
    }

    public int indexOf(Object o) {
        return users.indexOf(o);
    }

    public User get(int index) {
        return users.get(index);
    }

    public User set(int index, User element) {
        return users.set(index, element);
    }

    public boolean add(User e) {
        return users.add(e);
    }

    public void add(int index, User element) {
        users.add(index, element);
    }

    public User remove(int index) {
        return users.remove(index);
    }

    public boolean remove(User u) {
        return users.remove(u);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    
}
