/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    
    String id;
    String name;
    private String personName;
private String email;
private String phone;

public String getPersonName() {
    return personName;
}

public void setPersonName(String personName) {
    this.personName = personName;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}
    
    public Person (String id){
        
        this.id = id;
    }
    public String getPersonId(){
        return id;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    public String getName(){
        return name;
    }
    public void setName (String name) {
        this.name = name;
        
    }
}
