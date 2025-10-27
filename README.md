Digital University System — Group Assignment 1

INFO 5100: Application Engineering and Development

🏫 1. Project Title

Digital University System with Role-Based Access Control

👥 2. Team Information
Name	NUID	Role	Responsibilities
Gopal Anil Pillai	002309833	Student Role	Implemented all Student Use Case functionalities: Transcript, Course Registration, Financial Management, Graduation Audit, Profile Management, and CardLayout navigation.
Aasi	Faculty Role	Implemented Faculty Course Management, Grading, and Performance Reporting features.
Praharshit	Admin Role	Implemented Admin dashboard, User/Person management, analytics, and department/course setup.

🎯 3. Project Overview

The Digital University System simulates core university operations — including user authentication, access control, and academic workflows — for different roles:

Administrator: manages departments, users, and analytics.

Faculty: manages course details, student grades, and reports.

Student: registers for courses, manages tuition, checks transcripts, and tracks graduation progress.

Registrar (optional): handles financial reports and registration from the admin side.

Objectives

To implement role-based access control (RBAC) for secure user interactions.

To build a scalable academic model (Departments → Courses → CourseLoads → Transcripts).

To demonstrate modular design and GUI navigation using Java Swing and CardLayout.

⚙️ 4. Installation & Setup Instructions
Prerequisites

Java 17 or later

Apache NetBeans IDE 17+

Git & GitHub access

JDK with swing and javax packages included

Setup Steps

Clone the repository:

git clone https://github.com/<your-group-repo>/DigitalUniversitySystem.git


Open the project in Apache NetBeans.

Build the project (Clean and Build Project).

Run the main file:

Business/ProfileWorkAreaMainFrame.java


Log in with default pre-configured credentials (configured via ConfigureABusiness.initialize()):

Username: admin
Password: ****

🔐 5. Authentication & Access Control
Authentication Process

Implemented in ProfileWorkAreaMainFrame.java within LoginButtonActionPerformed().

Validates credentials via:

business.getUserAccountDirectory().AuthenticateUser(username, password);


On success, redirects user to their respective dashboard (Admin, Faculty, Student).

Logout Functionality
private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {
    CardSequencePanel.removeAll();
    CardSequencePanel.add(new JLabel("Logged out successfully."));
    ((CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    JOptionPane.showMessageDialog(this, "You have been logged out.");
}

Authorization Logic

Based on UserAccount.getRole().

Grants access only to the panels associated with that role.
Example:

if (profile instanceof StudentProfile) {
    studentPanel = new StudentWorkAreaJPanel(business, spp, usp, CardSequencePanel);
}

🧩 6. Features Implemented
Student Role (by Gopal Anil Pillai)

✅ Course Registration

Register or drop courses per semester.

Prevents exceeding credit limits (max 8 credits).

✅ Transcript Review

Calculates Term GPA and Overall GPA dynamically.

Displays Academic Standing (Good, Warning, Probation).

✅ Graduation Audit

Displays total completed credits vs remaining.

Verifies 32 credits minimum (4 core, rest electives).

✅ Financial Management

Shows tuition balance, payment history, and allows “Pay Tuition”.

Prevents transcript access until tuition fully paid.

✅ Profile Management

Allows students to view and update name, email, and phone.

Data validation for blank fields.

✅ Navigation

Each button uses CardLayout to switch panels dynamically.

“Back” buttons return to StudentWorkAreaJPanel.

🖱️ 7. Usage Instructions
Login

Enter username and password (for admin, student, or faculty).

Click Login to access role dashboard.

Student Role

Click Course Registration → Register or drop courses.

Click Transcript → View GPA and standings.

Click Graduation Audit → Check degree progress.

Click Financials → Pay tuition and review history.

Click Profile → Edit and save personal info.

Click Logout → Exit current session.

🧪 8. Testing Guide
Test Cases
Test	Input	Expected Result
Invalid login	wrong username/password	“Invalid Credentials” dialog
Student login	student01 / 1234	Student dashboard opens
Register course beyond limit	> 8 credits	“Credit limit exceeded” alert
Pay tuition twice	No balance	“No pending balance” dialog
Transcript GPA	3 graded courses	GPA auto-calculates correctly
Graduation check	≥32 credits	“Eligible for Graduation” message
Authentication Tests

Attempt to open a panel of another role (e.g., Faculty as Student) → Denied.

Logout clears session state and returns to login view.

⚠️ 9. Challenges & Solutions
Challenge	Solution
Linking academic StudentProfile to department	Added setDepartment() and linked via ProfileWorkAreaMainFrame.
Course registration error “Department not linked”	Fixed by initializing department in LoginButtonActionPerformed().
Handling GPA calculations	Used weighted credit-based GPA formula with letter mapping.
Synchronizing Swing panels	Used CardLayout for clean transitions and back navigation.
Tuition refund logic	Added check for dropped course refunds in Financial panel.
🚀 10. Future Enhancements

Integrate database persistence (JDBC or Hibernate).

Add email notification system for registration and payment.

Implement analytics dashboard for students and faculty.

Extend support for multi-semester registration and grade trends visualization.

🤝 11. Contribution Breakdown
Member	Contribution	Commits / PRs
Gopal Anil Pillai	Student Role: Transcript, Financial, Profile, Graduation Audit Panels, Authentication integration, Back/Logout navigation	15+ commits / 6 PRs
Member 2	Faculty Use Case	10+ commits / 5 PRs
Member 3	Admin Use Case	12+ commits / 5 PRs
Member 4	Registrar Use Case (optional)	8+ commits / 4 PRs
✅ Summary

Everything Implemented:

✅ Student Use Case (all 4 panels complete)

✅ Authentication & Role-Based Authorization

✅ Logout Functionality

✅ Department linkage fix

✅ UI/UX, validation, GPA logic, and data population

✅ Documentation ready for submission
