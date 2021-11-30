package Practice;

import java.util.Scanner;

public class Noname {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください（ｘ）：");
		int x = scan.nextInt();
		System.out.print("数字を入力してください（ｙ）：");
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println("ｘはｙより大きい");
		}else if(y > x) {
			System.out.println("ｘはｙより小さい");
		}else {
			System.out.println("ｘとｙは等しい");
		}
		
		System.out.print("数字を入力してください：");
		int num = scan.nextInt();
		if (num >= 0) {
			if(num%2 == 0) {
				System.out.println("正の偶数です");
			}else {
				System.out.println("正の奇数です");
			}
		}else {
			if(num%2 == 0) {
				System.out.println("負の偶数です");
			}else {
				System.out.println("負の奇数です");
			}
		}
		
	}
}
