package org.college;

public class Student extends Department {
public void studentName() {
	System.out.println("Mohammed Zaheer");
}
public void studentDept() {
	System.out.println("BCA");

}
public void studentId() {
	System.out.println("BCA-43567");

}
public static void main(String[] args) {
	Student stud = new Student();
	stud.studentName();
	stud.studentDept();
	stud.studentId();
	stud.deptname();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
	
}
}
