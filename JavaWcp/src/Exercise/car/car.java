package Exercise.car;

public class car {
	private double fuelCost;
	private double fuelAmount;
	
	//コンストラクタを作成
	public car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
	

}
