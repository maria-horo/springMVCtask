package nov21_que5;

public class Car {
	private int maxSpeed;
	private String color;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void carInfo() {
		System.out.println("Car [maxSpeed=" + maxSpeed + ", color=" + color + "]");
	}
}
