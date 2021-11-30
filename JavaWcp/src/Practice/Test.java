package Practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("試験の点数を入力してください：");
//		int score = scan.nextInt();
//		System.out.print("ケース1：");
//		if (score >= 60) {
//			System.out.println("合格");
//		}else {
//			System.out.println("不合格");
//		}
//		
//		System.out.print("ケース2：");
//		if(score >= 80) {
//			System.out.println("大変良くできました");
//		}else if (score < 60) {
//			System.out.println("残念でした");
//		}else {
//			System.out.println("よくできました");
//		}
//		
//		System.out.print("ケース3：");
//		if(score >= 80) {
//			System.out.println("優");
//		}else if (score >= 70) {
//			System.out.println("良");
//		}else if(score >= 60) {
//			System.out.println("可");
//		}else {
//			System.out.println("不可");
//		}
		
		System.out.print("中間試験の点数を入力してください：");
		int middleTest = scan.nextInt();
		System.out.print("期末試験の点数を入力してください：");
		int lastTest = scan.nextInt();
		int sumTest = middleTest + lastTest;
		if (middleTest >= 60 && lastTest >= 60) {
			System.out.println("合格");
		}else if(sumTest >= 130) {
			System.out.println("合格");
		}else if(sumTest >= 100 &&(middleTest >= 90 || lastTest >= 90)) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}

}

