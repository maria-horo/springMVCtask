package nov16Que1_3_4;

public class VariablesMain implements VariablesInInterface{

	public static void main(String[] args) {
		VariablesInInterface var = new VariablesMain();VariablesInInterface v = new VariablesMain();
		System.out.println(VariablesInInterface.name);
		//VariablesInInterface.name = "Blossom";
		//ERROR: final field cannot be assigned
		//var.age = 21; ERROR
	}
}
