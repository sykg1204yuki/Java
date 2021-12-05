package SYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NeoLesson5C3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int num1 = 9;
		int num2 = 2;
		int num3 = 5;
		
		for (int i = 1; i < 10; i ++) {
			
			System.out.print("1つ目の整数を入力してください：");
			String str1 = br.readLine();
			int res1 = Integer.parseInt(str1);
			System.out.print("2つ目の整数を入力してください：");
			String str2 = br.readLine();
			int res2 = Integer.parseInt(str2);
			System.out.print("3つ目の整数を入力してください：");
			String str3 = br.readLine();
			int res3 = Integer.parseInt(str3);
			
			System.out.println("入力された整数は、（" + res1 + "、"+ res2 + "、" + res3 + "）です");
			
			if (res1 == num1) {
				if (res2 == num2) {
					if (res3 == num3) {
						System.out.println("点数は6点です。");
					} else {
						System.out.println("点数は4点です。");
					}
				} else if (res2 == num3) {
					if (res3 == num3) {
						System.out.println("点数は4点です。");
					} else if (res3 == num2) {
						System.out.println("点数は4点です。");
					} else {
						System.out.println("点数は3点です。");
					}
				} else {
					if (res3 == num3) {
						System.out.println("点数は4点です。");
					} else if (res3 == num2) {
						System.out.println("点数は3点です。");
					} else {
						System.out.println("点数は2点です。");
					}
				}
			} else if (res1 == num2) {
				if (res2 == num2) {
					if (res3 == num3) {
						System.out.println("点数は4点です。");
					} else if (res3 == num1) {
						System.out.println("点数は4点です。");
					} else {
						System.out.println("点数は3点です。");
					}
				} else if (res2 == num1) {
					if (res3 == num3) {
						System.out.println("点数は3点です。");
					} else if (res3 == num1) {
						System.out.println("点数は2点です。");
					} else if (res3 == num2) {
						System.out.println("点数は3点です");
					}
				} else {
					if (res3 == num3) {
						System.out.println("点数は2点です。");
					} else if (res3 == num1) {
						System.out.println("点数は2点です。");
					} else if (res3 == num2) {
						System.out.println("点数は2点です");
					} else {
						System.out.println("点数は1点です。");
					}
				} 
			} else if (res1 == num3) {
				if (res2 == num2) {
					if (res3 == num3) {
						System.out.println("点数は4点です。");
					} else if (res3 == num1) {
						System.out.println("点数は4点です。");
					} else {
						System.out.println("点数は3点です。");
					}
				} else if (res2 == num1) {
					if (res3 == num3) {
						System.out.println("点数は3点です。");
					} else if (res3 == num1) {
						System.out.println("点数は2点です。");
					} else if (res3 == num2) {
						System.out.println("点数は3点です");
					}
				} else {
					if (res3 == num3) {
						System.out.println("点数は2点です。");
					} else if (res3 == num1) {
						System.out.println("点数は2点です。");
					} else if (res3 == num2) {
						System.out.println("点数は2点です");
					} else {
						System.out.println("点数は1点です。");
					}
				}
			} else {
				if (res2 == num2) {
					if (res3 == num3) {
						System.out.println("点数は4点です");
					} else if (res3 == num1) {
						System.out.println("点数は3点です。");
					} else {
						System.out.println("点数は2点です。");
					}
				} else if (res2 == num1) {
					if (res3 == num3) {
						System.out.println("点数は3点です");
					} else if (res3 == num1) {
						System.out.println("点数は1点です。");
					} else if (res3 == num2) {
						System.out.println("点数は2点です。");
					}
				} else {
					if (res3 == num3) {
						System.out.println("点数は2点です。");
					} else if (res3 == num1) {
						System.out.println("点数は1点です。");
					} else if (res3 == num2) {
						System.out.println("点数は1点です。");
					} else {
						System.out.println("点数は0点です。");
					}
				}
			}
		}
	}
}
