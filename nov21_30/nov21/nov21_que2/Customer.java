package nov21_que2;
//2. Write a program to show the advantages of using abstraction
//   and encapsulation concepts.


public class Customer { // encapsulation
	private int customer_id;
	private String customer_name;
	private String customer_email;
	private double customer_amount;
	
	public Customer(int customer_id, String customer_name, String customer_email, double customer_amount) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		if(customer_amount > 0) {
			this.customer_amount = customer_amount;
		}
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public double getCustomer_amount() {
		return customer_amount;
	}
	public void setCustomer_amount(double customer_amount) {
		this.customer_amount = customer_amount;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_email="
				+ customer_email + ", customer_amount=" + customer_amount + "]";
	}

}
