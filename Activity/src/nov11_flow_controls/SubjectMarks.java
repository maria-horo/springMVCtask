package nov11_flow_controls;
//7. WAP to accept marks for 5 subjects & print max, min, avg of 5.

import java.util.Scanner;

public class SubjectMarks {
	void marks_5subjects() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks for the following subjects");
		System.out.println("English:");
		double english = sc.nextDouble();
		System.out.println("Hindi:");
		double hindi = sc.nextDouble();
		System.out.println("Mathematics:");
		double mathematics = sc.nextDouble();
		System.out.println("Science:");
		double science = sc.nextDouble();
		System.out.println("Social Studies:");
		double socialStudies = sc.nextDouble();
		
		if(english>=hindi && english>=mathematics && english>=science && english>=socialStudies) {
			System.out.println("Maximum marks: "+ english+" in English");
		} 
		else if(hindi>=mathematics && hindi>=science && hindi>=socialStudies) {
			System.out.println("Maximum marks: "+ hindi+" in Hindi");
		}
		else if(mathematics>=science && mathematics>=socialStudies) {
			System.out.println("Maximum marks: "+ mathematics+" in Mathematics");
		}
		else if(science>=socialStudies) {
			System.out.println("Maximum marks: "+ science+" in Science");
		}
		else {
			System.out.println("Maximum marks: "+socialStudies+" in Social Studies");
		}
		
		if(english<=hindi && english<=mathematics && english<=science && english<=socialStudies) {
			System.out.println("Minimum marks: "+ english+" in English");
		} 
		else if(hindi<=mathematics && hindi<=science && hindi<=socialStudies) {
			System.out.println("Minimum marks: "+ hindi+" in Hindi");
		}
		else if(mathematics<=science && mathematics<=socialStudies) {
			System.out.println("Minimum marks: "+ mathematics+" in Mathematics");
		}
		else if(science<=socialStudies) {
			System.out.println("Minimum marks: "+ science+" in Science");
		}
		else {
			System.out.println("Minimum marks: "+socialStudies+" in Social Studies");
		}
		
		double average = (english + hindi + mathematics + science + socialStudies)/5;
		System.out.println("The average of the marks is: "+average);
		sc.close();
	}

	public static void main(String[] args) {
		
		SubjectMarks subject = new SubjectMarks();
		subject.marks_5subjects();
	}

}
