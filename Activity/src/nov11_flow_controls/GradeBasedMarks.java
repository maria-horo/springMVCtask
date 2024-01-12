package nov11_flow_controls;
//2. Write a program to find the grade based on total marks 
//   obtained using switch and if else conditions

public class GradeBasedMarks {
	void gradeMarksSwitch(int marks) {
		switch(marks/10) {
		case 10:
		case 9: System.out.println("GRADE-A");
		break;
		case 8: System.out.println("GRADE-B");
		break;
		case 7: System.out.println("GRADE-C");
		break;
		case 6: System.out.println("GRADE-D");
		break;
		case 5: System.out.println("GRADE-E");
		break;
		case 4:
		case 3: 
		case 2:
		case 1:
		case 0:	System.out.println("GRADE-F: FAIL");
		break;
		default: System.out.println("Invalid marks");
		}
	}

	void gradeMarksIfElse( int marks ) {
		if ( marks>90 && marks<=100 ) {
			System.out.println("GRADE-A");
		} else if( marks>80 && marks <=90 ) {
			System.out.println("GRADE-B");
		} else if( marks>70 && marks <=80 ) {
			System.out.println("GRADE-C");
		} else if( marks>60 && marks <=70 ) {
			System.out.println("GRADE-D");
		} else if( marks>50 && marks <=60 ) {
			System.out.println("GRADE-E");
		} else if( marks <=50 ) {
			System.out.println("GRADE-F: FAIL");
		} else {
			System.out.println("Invalid marks");
		}
	}

	public static void main(String[] args) {
		GradeBasedMarks grade = new GradeBasedMarks();
		grade.gradeMarksSwitch(23);
		grade.gradeMarksIfElse(55);
	}
}
