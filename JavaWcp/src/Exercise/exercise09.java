package Exercise;

import Exercise.car.car;

public class exercise09 {
	public static void main(String[] args) {
		double fuelCost = 12.5;
		double fuelAmount = 55.0;
		
		car car = new car(fuelCost, fuelAmount);
		
		car.move(20);
		System.out.println("残量は、" + car.getFuelAmount() + "です。");
	}

}
