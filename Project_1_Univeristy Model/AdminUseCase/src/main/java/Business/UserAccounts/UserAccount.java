/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;
    String username;
    String password;
    String status;  
    String lastActivity;  
    String lastUpdated;
    
    public UserAccount (Profile profile, String un, String pw){
    username = un;
    password = pw;
    this.profile = profile;
    this.status = "Active";
    this.lastActivity = "Never";
    this.lastUpdated = java.time.LocalDate.now().toString();
}

    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
        public boolean IsValidUser(String un, String pw){
        
            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        
        }
        public String getRole(){
            return profile.getRole();
        }
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
        public String getStatus() {
    return status;
}

    public void setStatus(String status) {
    this.status = status;
    this.lastUpdated = java.time.LocalDate.now().toString();
}

    public String getLastActivity() {
    return lastActivity;
}

    public void setLastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
}

    public String getLastUpdated() {
    return lastUpdated;
}
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }
        
}

