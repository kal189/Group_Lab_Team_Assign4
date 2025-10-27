/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import info5100.university.example.College.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentDirectory;
/**
 *
 * @author aasikaleem
 */
public class ConfigureUniversity {
    
     public static Department initialize() {
        
        Department department = new Department("Information Systems");
        
        PersonDirectory personDirectory = department.getPersonDirectory();
        Person person1 = personDirectory.newPerson("P001");
        Person person2 = personDirectory.newPerson("P002");
        Person person3 = personDirectory.newPerson("P003");
        
        StudentDirectory studentDirectory = department.getStudentDirectory();
        StudentProfile student1 = studentDirectory.newStudentProfile(person1);
        StudentProfile student2 = studentDirectory.newStudentProfile(person2);
        StudentProfile student3 = studentDirectory.newStudentProfile(person3);
        
        CourseCatalog courseCatalog = department.getCourseCatalog();
        Course course1 = courseCatalog.newCourse("Application Engineering", "INFO 5100", 4);
        Course course2 = courseCatalog.newCourse("Web Design", "INFO 6150", 4);
        Course course3 = courseCatalog.newCourse("Data Structures", "INFO 5001", 4);

        CourseSchedule schedule = department.newCourseSchedule("Fall 2025");
        CourseOffer offer1 = schedule.newCourseOffer("INFO 5100");
        offer1.generatSeats(30);
        
        CourseOffer offer2 = schedule.newCourseOffer("INFO 6150");
        offer2.generatSeats(25);
        
        System.out.println("University initialized: 3 students, 3 courses");
        
        return department;
    }
}
