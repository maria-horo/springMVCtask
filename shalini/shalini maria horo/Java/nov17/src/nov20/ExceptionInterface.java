package nov20;
//1. Write a program to throw checked exceptions using throw and throws


public interface ExceptionInterface {
	void marriageAge();
	void voteEligibility() throws InvalidAgeException;
	void nestedTry();
	void reThrowException(int num1, int num2);
}
