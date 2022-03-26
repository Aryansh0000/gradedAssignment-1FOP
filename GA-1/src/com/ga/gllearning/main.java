package com.ga.gllearning;

class SuperDepartment{
	String departmentName() {
		return "Super Department";
	}
	String getTodayWork() {
		return "No Work as of now";
	}
	String getWorkDeadline() {
		return "Nil";
	}
	String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	
}
class AdminDepartment extends SuperDepartment{
	
	String departmentName() {
		return "Admin Department";
	}
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class HrDepartment extends SuperDepartment{
	
	String departmentName() {
		return "HR Department";
	}
	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String doActivity() {
		return "team Lunch";
	}
}

class TechDepartment extends SuperDepartment{
	
	String departmentName() {
		return "Tech Department";
	}
	String getTodaysWork() {
		return "Complete coding of module 1";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String getTechStackInformation() {
		return "core Java";
	}
}
public class main {

	public static void main(String[] args) {

		HrDepartment h = new HrDepartment();
		TechDepartment t = new TechDepartment();
		AdminDepartment a = new AdminDepartment();
		
		System.out.println(" Welcome to " + a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		System.out.println(" Welcome to " + h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday());
		System.out.println();
		System.out.println(" Welcome to " + t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayAHoliday());

		

		
		

	}

}
