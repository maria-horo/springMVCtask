package spring_1;

import java.util.List;

public class Vehicle {
	
		private List <Car> car;
		private List <Bike> bike;
		
		public List<Car> getCar() {
			return car;
		}
		public void setCar(List<Car> car) {
			this.car = car;
		}
		public List<Bike> getBike() {
			return bike;
		}
		public void setBike(List<Bike> bike) {
			this.bike = bike;
		}
		
		@Override
		public String toString() {
			return "Vehicle [car=" + car + ", bike=" + bike + "]";
		}
}
