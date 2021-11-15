package Progate.Car;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
	    System.out.println("【自転車の情報】");
	    bicycle.printData();
	    
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    Scanner scan = new Scanner(System.in);
	    int distance = scan.nextInt();
	    bicycle.run(distance);
	    
	    System.out.println("=================");
	    Car car = new Car("フェラーリ", "赤");
	    System.out.println("【車の情報】");
	    car.printData();
	    
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int move = scan.nextInt();
	    car.run(move);
	    
	    System.out.println("-----------------");
	    System.out.print("給油する量を入力してください：");
	    int refueling = scan.nextInt();
	    car.charge(refueling);
	  }
}
