package nov21_que2;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Sapna Choudhary", "sapnabiro12@gmail.com", 6500.30);
		Customer customer2 = new Customer(567, "Rakhi Mondal", "mondal123@gmail.com", 9900.60);
		Customer customer3 = new Customer(555, "Jyoti and bhargavi", "bharjo@gmail.com", 4440.80);
		customer3.setCustomer_name("JyotiBhargavi");
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
	}

}
