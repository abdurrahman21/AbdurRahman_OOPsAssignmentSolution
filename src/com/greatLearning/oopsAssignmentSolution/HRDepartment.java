package com.greatLearning.oopsAssignmentSolution;

public class HRDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's worksheetand mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete By EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	
	public String getSuperDepClass() {
		return super.isTodayAHoliday();
	}
	
	public static void main(String args[]) {
		HRDepartment HRDepartment = new HRDepartment();
		System.out.println("Welcome to " + HRDepartment.departmentName());
		System.out.println(HRDepartment.doActivity());
		System.out.println(HRDepartment.getTodaysWork());
		System.out.println(HRDepartment.getWorkDeadline());
		System.out.println(HRDepartment.getSuperDepClass());
	}
}
