package Car;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double fuelCost = 12.5;
		double fuelAmount = 55.0;
		
		
		while(fuelAmount >= 0) {
			System.out.print("何km走りますか：");
			double km = scan.nextDouble();
			
			carRun(km, fuelAmount, fuelCost);
			fuelAmount -= useAmount(km, fuelCost);
			if (fuelAmount < 5.0) {
				System.out.println("燃料を補給してください");
				double addAmount = 55.0 - fuelAmount;
				fuelAmount += addAmount;
			}
		}
		
		
		
	}
	
	public static void carRun(double km, double fuelAmount, double fuelCost) {
		System.out.println(km + "km走ります");
		fuelAmount -= useAmount(km, fuelCost);
		System.out.println("残量は、" + String.format("%.2f",fuelAmount) + "です");
		
	}
	
	public static double useAmount(double km, double fuelCost) {
		return km/fuelCost;
	}
	
//	public static double fuelAmount(double fuelAmount, double km, double fuelCost) {
//		return fuelAmount -= useAmount(km, fuelCost);
//	}

}
