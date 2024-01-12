package nov20;

public class MainClass {
	JavaClasses java = new JavaClasses();

	public static void main(String[] args) {
		JavaClasses java = new JavaClasses();
		java.marriageAge();//1

		try {//6, 7
			java.voteEligibility();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		java.nestedTry();

		java.reThrowException(40,20);



	}
}
