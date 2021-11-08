package Progate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("何人分の情報を入力しますか：");
		int count = scanner.nextInt();
		System.out.println(count + "人分の情報を入力します");
		int maxAge = 0;
		int totalAge = 0;
		
		
		for (int n = 0; n < count; n++) {
			System.out.println(n+1 + "人目の情報");
			
			System.out.print("名前：");
			String name = scanner.next();
			
			System.out.print("性別：");
			String sex = scanner.next();
			
			System.out.print("年齢：");
			int age = scanner.nextInt();
			if (age > maxAge) {
				maxAge = age;
			}
			totalAge += age;
			
			System.out.print("身長(m)：");
			double height = scanner.nextDouble();
			
			System.out.print("体重(kg)：");
			double weight = scanner.nextDouble();
			
			Person.printData(name, sex, age, height, weight);
		}
		System.out.println("最高年齢は" + maxAge + "歳です");
		double averageAge = totalAge/count;
		System.out.println("平均年齢は" + averageAge + "歳です");
		
	}
		
	

}
