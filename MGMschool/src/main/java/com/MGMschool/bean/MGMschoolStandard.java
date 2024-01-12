package com.MGMschool.bean;

public class MGMschoolStandard {
	private int classStrength;
	private String studentName;
	
	public int getClassStrength() {
		return classStrength;
	}
	public void setClassStrength(int classStrength) {
		this.classStrength = classStrength;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "MGMschoolConfig [classStrength=" + classStrength + ", studentName=" + studentName + "]";
	}
}
