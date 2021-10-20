package Exercise;

import Exercise.car02.car;

public class exercise09_02 {
	public static void main(String[] args) {
		//燃料（km/L)
		double fuelCost = 12.5;
		//残量（L）
		double fuelAmount = 55.0;
		
		car car = new car(fuelCost, fuelAmount);
		
		car.move(20);
		System.out.println("残量は" + car.getFuelAmount() + "です");
	}

}
