package org.College;

public class Dept {

	public void deptName() {
		 System.out.println("Commerce");
		}
	public static void main(String[]args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student d= new Student();
		d.studentName();
		d.studentDept();
		d.studentId();
		Hostel h=new Hostel();
		h.hostelName();
		Dept i = new Dept();
		i.deptName();
	}
}
