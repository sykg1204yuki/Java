package Progate.Car;

public class Car {
	private String name;
	  private String color;
	  private int distance = 0;
	  private int fuel = 100;
	  
	  Car(String name, String color){
	    this.name = name;
	    this.color =color;
	  }
	  
	  public String getName(){
	    return this.name;
	  }
	  
	  public String getColor(){
	    return this.color;
	  }
	  
	  public void printData(){
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離：" + this.distance + "km");
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
	  
	  public void run(int move){
	    System.out.println(move + "km走ります");
	    if (move <= this.fuel){
	      this.distance += move;
	      this.fuel -= move;
	    }else{
	      System.out.println("ガソリンが足りません");
	    }
	    System.out.println("走行距離：" + this.distance + "km");
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
	  
	  public void charge(int refueling){
	    System.out.println(refueling + "L給油します");
	    if (refueling < 0){
	      System.out.println("給油できません");
	    }else if((refueling+this.fuel) >= 100){
	      System.out.println("満タンまで給油します");
	      this.fuel = 100;
	    }else{
	      this.fuel += refueling;
	    }
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
}
