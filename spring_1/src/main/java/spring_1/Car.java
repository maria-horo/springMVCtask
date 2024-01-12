package spring_1;

public class Car {
	private int carnum;
	private String carname;
	
	public int getCarnum() {
		return carnum;
	}
	public void setCarnum(int carnum) {
		this.carnum = carnum;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	@Override
	public String toString() {
		return "Car [carnum=" + carnum + ", carname=" + carname + "]";
	}
}
