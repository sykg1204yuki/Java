package Practice;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("数字を入力したください(x)：");
//		int x = scan.nextInt();
//		System.out.print("数字を入力したください(y)：");
//		int y = scan.nextInt();
//		System.out.println((x + y)/2);
		
		System.out.print("数字を2つ入力してください（スペース区切り）：");
		int sum = 0;
		int[] data = new int[2];
		for (int i=0; i<data.length; i++) {
			data[i] = scan.nextInt();
			sum += data[i];
		}
		System.out.println(data[0]);
		System.out.println(data[1]);
		int average = sum/data.length;
		System.out.println(average);
		
		
		
		
		
		
	}

}
