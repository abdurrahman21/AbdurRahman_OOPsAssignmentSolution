package com.greatLearning.oopsAssignmentSolution;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Tech Department";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechSatckInformation() {
		return "Core Java";
	}
	
	public String getSuperDepClass() {
		return super.isTodayAHoliday();
	}
	
	public static void main(String args[]) {
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechSatckInformation());
		System.out.println(tech.getSuperDepClass());
	}
}
