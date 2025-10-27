/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/


import Business.Business;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

     static Business initialize() {
        Business business = new Business("Information Systems");
        
        PersonDirectory persondirectory = business.getPersonDirectory();
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        StudentDirectory studentdirectory = business.getStudentDirectory();
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        
        Person adminPerson = persondirectory.newPerson("A001", "John Smith", "john.smith@university.edu");
        EmployeeProfile adminProfile = employeedirectory.newEmployeeProfile(adminPerson);
        UserAccount adminAccount = uadirectory.newUserAccount(adminProfile, "admin", "****");
        
        Person faculty1 = persondirectory.newPerson("F001", "Dr. Sarah Johnson", "sarah.johnson@university.edu");
        Person faculty2 = persondirectory.newPerson("F002", "Dr. Michael Chen", "michael.chen@university.edu");
        Person faculty3 = persondirectory.newPerson("F003", "Dr. Emily Martinez", "emily.martinez@university.edu");
        Person faculty4 = persondirectory.newPerson("F004", "Dr. David Wilson", "david.wilson@university.edu");
        Person faculty5 = persondirectory.newPerson("F005", "Dr. Jessica Brown", "jessica.brown@university.edu");
        Person faculty6 = persondirectory.newPerson("F006", "Dr. Robert Taylor", "robert.taylor@university.edu");
        Person faculty7 = persondirectory.newPerson("F007", "Dr. Amanda Garcia", "amanda.garcia@university.edu");
        Person faculty8 = persondirectory.newPerson("F008", "Dr. Christopher Lee", "christopher.lee@university.edu");
        Person faculty9 = persondirectory.newPerson("F009", "Dr. Michelle Anderson", "michelle.anderson@university.edu");
        Person faculty10 = persondirectory.newPerson("F010", "Dr. James White", "james.white@university.edu");
        
        EmployeeProfile facultyProfile1 = employeedirectory.newEmployeeProfile(faculty1);
        EmployeeProfile facultyProfile2 = employeedirectory.newEmployeeProfile(faculty2);
        EmployeeProfile facultyProfile3 = employeedirectory.newEmployeeProfile(faculty3);
        EmployeeProfile facultyProfile4 = employeedirectory.newEmployeeProfile(faculty4);
        EmployeeProfile facultyProfile5 = employeedirectory.newEmployeeProfile(faculty5);
        EmployeeProfile facultyProfile6 = employeedirectory.newEmployeeProfile(faculty6);
        EmployeeProfile facultyProfile7 = employeedirectory.newEmployeeProfile(faculty7);
        EmployeeProfile facultyProfile8 = employeedirectory.newEmployeeProfile(faculty8);
        EmployeeProfile facultyProfile9 = employeedirectory.newEmployeeProfile(faculty9);
        EmployeeProfile facultyProfile10 = employeedirectory.newEmployeeProfile(faculty10);
        
        Person student1 = persondirectory.newPerson("S001", "Adam Rollen", "adam.rollen@student.edu");
        Person student2 = persondirectory.newPerson("S002", "Emma Thompson", "emma.thompson@student.edu");
        Person student3 = persondirectory.newPerson("S003", "Oliver Davis", "oliver.davis@student.edu");
        Person student4 = persondirectory.newPerson("S004", "Sophia Miller", "sophia.miller@student.edu");
        Person student5 = persondirectory.newPerson("S005", "Liam Rodriguez", "liam.rodriguez@student.edu");
        Person student6 = persondirectory.newPerson("S006", "Ava Martinez", "ava.martinez@student.edu");
        Person student7 = persondirectory.newPerson("S007", "Noah Jackson", "noah.jackson@student.edu");
        Person student8 = persondirectory.newPerson("S008", "Isabella Harris", "isabella.harris@student.edu");
        Person student9 = persondirectory.newPerson("S009", "Ethan Clark", "ethan.clark@student.edu");
        Person student10 = persondirectory.newPerson("S010", "Mia Lewis", "mia.lewis@student.edu");
        
        StudentProfile studentProfile1 = studentdirectory.newStudentProfile(student1);
        StudentProfile studentProfile2 = studentdirectory.newStudentProfile(student2);
        StudentProfile studentProfile3 = studentdirectory.newStudentProfile(student3);
        StudentProfile studentProfile4 = studentdirectory.newStudentProfile(student4);
        StudentProfile studentProfile5 = studentdirectory.newStudentProfile(student5);
        StudentProfile studentProfile6 = studentdirectory.newStudentProfile(student6);
        StudentProfile studentProfile7 = studentdirectory.newStudentProfile(student7);
        StudentProfile studentProfile8 = studentdirectory.newStudentProfile(student8);
        StudentProfile studentProfile9 = studentdirectory.newStudentProfile(student9);
        StudentProfile studentProfile10 = studentdirectory.newStudentProfile(student10);
        
        UserAccount facultyAccount1 = uadirectory.newUserAccount(facultyProfile1, "sarah", "****");
        UserAccount facultyAccount2 = uadirectory.newUserAccount(facultyProfile2, "michael", "****");


System.out.println("=== FACULTY ACCOUNTS CREATED ===");
System.out.println("Faculty 1 - Username: " + facultyAccount1.getUserLoginName() + ", Person ID: " + facultyAccount1.getPersonId());
System.out.println("Faculty 2 - Username: " + facultyAccount2.getUserLoginName() + ", Person ID: " + facultyAccount2.getPersonId());
System.out.println("================================");

System.out.println("Business initialized: 1 Admin, 10 Faculty (2 with login), 10 Students");

return business;
    }

}
