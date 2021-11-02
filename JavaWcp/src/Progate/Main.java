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
			
			printData(name, sex, age, height, weight);
		}
		System.out.println("最高年齢は" + maxAge + "歳です");
		double averageAge = totalAge/count;
		System.out.println("平均年齢は" + averageAge + "歳です");
		
	}
		
	public static void printData(String name, String sex, int age, double height, double weight) {
		System.out.println("名前は、" + name + "です");
		
		if (sex(sex)) {
			System.out.println("性別は、" + sex + " です");
		}else {
			System.out.println("性別は非公開です");
		}
		
		System.out.println("年齢は" + age + "歳です");
		if (age >= 20) {
			System.out.println("成年者です");
		}else {
			System.out.println("未成年者です");
		}
		
		System.out.println("身長は" + height + "mです");
		if (sex.equals("男")) {
			heightMan(height);
		}else if(sex.equals("女")) {
			heightWoman(height);
		}else {
			System.out.println("判断できません");
		}
		
		System.out.println("体重は" + weight + "kgです");
		
		double bmi = bmi(height, weight);
		System.out.println("BMIは" + Math.round(bmi) + "です");
		if (isHealthy(bmi)) {
			System.out.println("健康です");
		}else {
			System.out.println("健康ではありません");
		}
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
	public static boolean isHealthy(double bmi) {
		return bmi >= 18.5 && bmi < 25.0;
	}
	
	public static boolean sex(String sex) {
		return sex.equals("男") || sex.equals("女");
	}
	
	public static void heightMan(double height) {
		if (height >= 1.75) {
			System.out.println("高身長です");
		}else if(height >= 1.70 && height < 1.75){
			System.out.println("平均身長です");
		}else {
			System.out.println("背が低いです");
		}
	}
	
	public static void heightWoman(double height) {
		if (height >= 1.60) {
			System.out.println("高身長です");
		}else if(height >= 1.55 && height < 1.60){
			System.out.println("平均身長です");
		}else {
			System.out.println("背が低いです");
		}
	}

}
