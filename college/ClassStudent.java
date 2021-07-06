package org.college;

public class ClassStudent {

	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(id + " " +name);

	}
	public void getStudentInfo(String email, String PhNo) {
		System.out.println(email);
		System.out.println(PhNo);

	}
	
	public static void main(String[] args) {
		ClassStudent stud = new ClassStudent();
		stud.getStudentInfo(657);
		stud.getStudentInfo(657, "Moahmmed Zaheeruddin");
		stud.getStudentInfo("rey.zaheer2008@gmail.com", "9941006993");

	}

}
