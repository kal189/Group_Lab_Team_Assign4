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
        adminPerson.setDepartment("Administration"); 
        
        Person faculty1 = persondirectory.newPerson("F001", "Dr. Sarah Johnson", "sarah.johnson@university.edu");
        faculty1.setDepartment("Computer Science");
        Person faculty2 = persondirectory.newPerson("F002", "Dr. Michael Chen", "michael.chen@university.edu");
        faculty2.setDepartment("Information Systems");
        Person faculty3 = persondirectory.newPerson("F003", "Dr. Emily Martinez", "emily.martinez@university.edu");
        faculty3.setDepartment("Computer Science");
        Person faculty4 = persondirectory.newPerson("F004", "Dr. David Wilson", "david.wilson@university.edu");
        faculty4.setDepartment("Business Administration");
        Person faculty5 = persondirectory.newPerson("F005", "Dr. Jessica Brown", "jessica.brown@university.edu");
        faculty5.setDepartment("Information Systems");
        Person faculty6 = persondirectory.newPerson("F006", "Dr. Robert Taylor", "robert.taylor@university.edu");
        faculty6.setDepartment("Data Science");
        Person faculty7 = persondirectory.newPerson("F007", "Dr. Amanda Garcia", "amanda.garcia@university.edu");
        faculty7.setDepartment("Computer Science");
        Person faculty8 = persondirectory.newPerson("F008", "Dr. Christopher Lee", "christopher.lee@university.edu");
        faculty8.setDepartment("Business Administration");
        Person faculty9 = persondirectory.newPerson("F009", "Dr. Michelle Anderson", "michelle.anderson@university.edu");
        faculty9.setDepartment("Information Systems");
        Person faculty10 = persondirectory.newPerson("F010", "Dr. James White", "james.white@university.edu");
        faculty10.setDepartment("Data Science");
        Person faculty11 = persondirectory.newPerson("F011", "Dr. Lisa Park", "lisa.park@university.edu");
        faculty11.setDepartment("Computer Science");
        Person faculty12 = persondirectory.newPerson("F012", "Dr. Richard Moore", "richard.moore@university.edu");
        faculty12.setDepartment("Business Administration");
        
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
        EmployeeProfile facultyProfile11 = employeedirectory.newEmployeeProfile(faculty11);
        EmployeeProfile facultyProfile12 = employeedirectory.newEmployeeProfile(faculty12);
        
        // 17 Students with different departments
        Person student1 = persondirectory.newPerson("S001", "Adam Rollen", "adam.rollen@student.edu");
        student1.setDepartment("Information Systems");
        Person student2 = persondirectory.newPerson("S002", "Emma Thompson", "emma.thompson@student.edu");
        student2.setDepartment("Computer Science");
        Person student3 = persondirectory.newPerson("S003", "Oliver Davis", "oliver.davis@student.edu");
        student3.setDepartment("Information Systems");
        Person student4 = persondirectory.newPerson("S004", "Sophia Miller", "sophia.miller@student.edu");
        student4.setDepartment("Data Science");
        Person student5 = persondirectory.newPerson("S005", "Liam Rodriguez", "liam.rodriguez@student.edu");
        student5.setDepartment("Computer Science");
        Person student6 = persondirectory.newPerson("S006", "Ava Martinez", "ava.martinez@student.edu");
        student6.setDepartment("Business Administration");
        Person student7 = persondirectory.newPerson("S007", "Noah Jackson", "noah.jackson@student.edu");
        student7.setDepartment("Information Systems");
        Person student8 = persondirectory.newPerson("S008", "Isabella Harris", "isabella.harris@student.edu");
        student8.setDepartment("Data Science");
        Person student9 = persondirectory.newPerson("S009", "Ethan Clark", "ethan.clark@student.edu");
        student9.setDepartment("Computer Science");
        Person student10 = persondirectory.newPerson("S010", "Mia Lewis", "mia.lewis@student.edu");
        student10.setDepartment("Business Administration");
        Person student11 = persondirectory.newPerson("S011", "Lucas Walker", "lucas.walker@student.edu");
        student11.setDepartment("Information Systems");
        Person student12 = persondirectory.newPerson("S012", "Charlotte Hall", "charlotte.hall@student.edu");
        student12.setDepartment("Computer Science");
        Person student13 = persondirectory.newPerson("S013", "Mason Allen", "mason.allen@student.edu");
        student13.setDepartment("Data Science");
        Person student14 = persondirectory.newPerson("S014", "Amelia Young", "amelia.young@student.edu");
        student14.setDepartment("Business Administration");
        Person student15 = persondirectory.newPerson("S015", "Elijah King", "elijah.king@student.edu");
        student15.setDepartment("Information Systems");
        Person student16 = persondirectory.newPerson("S016", "Harper Wright", "harper.wright@student.edu");
        student16.setDepartment("Computer Science");
        Person student17 = persondirectory.newPerson("S017", "James Scott", "james.scott@student.edu");
        student17.setDepartment("Data Science");
        
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
        StudentProfile studentProfile11 = studentdirectory.newStudentProfile(student11);
        StudentProfile studentProfile12 = studentdirectory.newStudentProfile(student12);
        StudentProfile studentProfile13 = studentdirectory.newStudentProfile(student13);
        StudentProfile studentProfile14 = studentdirectory.newStudentProfile(student14);
        StudentProfile studentProfile15 = studentdirectory.newStudentProfile(student15);
        StudentProfile studentProfile16 = studentdirectory.newStudentProfile(student16);
        StudentProfile studentProfile17 = studentdirectory.newStudentProfile(student17);
        
        UserAccount studentAccount1 = uadirectory.newUserAccount(studentProfile1, "adam", "****");
        
        
        System.out.println("Business initialized: 1 Admin, 12 Faculty, 17 Students = 30 Total");
        
        return business;
    }


}
