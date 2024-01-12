package nov11_flow_controls;

import java.util.Scanner;

public class ElectricityBillUsage {
	void electricBillPredicter()
	{
		Scanner scanner = new Scanner(System.in);

		// Accept the number of units consumed
		System.out.print("Enter the number of units consumed: ");
		int unitsConsumed = scanner.nextInt();

		// Calculate the bill amount and determine the usage
		double billAmount;
		String usage;

		if (unitsConsumed <= 50) {
			billAmount = 250;
			usage = "Minimum Usage";
		} else if (unitsConsumed <= 100) {
			billAmount = 250 + (unitsConsumed - 50) * 5;
			usage = "Moderate Usage";
		} else {
			billAmount = 250 + (50 * 5) + (unitsConsumed - 100) * 8;
			usage = "High Usage";
		}

		// Print the results
		System.out.println("Electricity Bill: Rs " + billAmount);
		System.out.println("Usage: " + usage);

		// Close the scanner to prevent resource leak
		scanner.close();
	}
	public static void main(String[] args) {
		ElectricityBillUsage billUsage =new ElectricityBillUsage();
		billUsage.electricBillPredicter();
	}
}
