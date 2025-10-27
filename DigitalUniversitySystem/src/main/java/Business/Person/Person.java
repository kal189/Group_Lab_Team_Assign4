/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {
    String id;
    String name;
    String email;
    
    public Person(String id) {
        this.id = id;
        this.name = id;
        this.email = "";
    }
    
    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public String getPersonId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
