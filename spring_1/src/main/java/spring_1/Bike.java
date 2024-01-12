package spring_1;

public class Bike {
	private int bikenum;
	private String bikename;
	
	public int getBikenum() {
		return bikenum;
	}
	public void setBikenum(int bikenum) {
		this.bikenum = bikenum;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	
	@Override
	public String toString() {
		return "Bike [bikenum=" + bikenum + ", bikename=" + bikename + "]";
	}
}
