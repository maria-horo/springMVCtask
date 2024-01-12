package classtoclass;

public class Programmer extends Employee {
	
	int bonus = 1000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("programmer salary: "+ p.salary);

	}

}
