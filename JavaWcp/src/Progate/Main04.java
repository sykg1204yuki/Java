package Progate;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("何人分の情報を入力しますか：");
		int count = scanner.nextInt();
		int maxAge = 0;
		int totalAge = 0;
		
		for (int i = 0; i < count; i++) {
			System.out.println(i+1 + "人目");
			
			System.out.print("名前：");
			String firstName = scanner.next();
			
			System.out.print("名字は：");
			String lastName = scanner.next();
			
			System.out.print("年齢は：");
			int age = scanner.nextInt();
			if (age > maxAge) {
				maxAge = age;
			}
			totalAge += age;
			
			System.out.print("身長(m)：");
			double height = scanner.nextDouble();
			
			System.out.print("体重(kg)：");
			double weight = scanner.nextDouble();
			
			Person.printData(firstName, lastName, age, height, weight);
			
		}
		System.out.println("最高年齢は" + maxAge + "歳です");
		double averageAge = totalAge/count;
		System.out.println("平均年齢は" + averageAge + "歳です");
		
		
	}
		
	

}
