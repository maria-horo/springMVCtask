package nov11_flow_controls;
//9
public class SumAndAverage {

	void sumAndAverage() {

		int upperbound = 100;

		// Calculate the sum and average
		int sum = 0;
		double average;

		for (int i = 1; i <= upperbound; i++) {
			sum += i;
		}

		average = (double) sum / upperbound;

		// Print the results
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}
	public static void main(String[] args) {
		SumAndAverage andAverage=new SumAndAverage();
		andAverage.sumAndAverage();
	}
}
