package Progate.Car;

public class Bicycle02 {
	private String name;
	  private String color;
	  private int distance = 0;
	  
	  Bicycle02(String name, String color){
	    this.name = name;
	    this.color = color;
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
	  }
	  
	  public void run(int distance){
	    System.out.println(distance + "km走ります");
	    this.distance += distance;
	    System.out.println("走行距離：" + this.distance + "km");
	  }
}
