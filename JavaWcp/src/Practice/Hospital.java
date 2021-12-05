package Practice;

import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("曜日を入力してください：");
		System.out.print("(日曜：0、月曜：1、火曜：2、水曜：3、木曜：4、金曜：5、土曜：6)：");
		int day = scan.nextInt();
		System.out.print("希望診療時間を入力してください（午前：0、午後：1、夜間：2）：");
		int zone = scan.nextInt();
		
		if(day == 0) {
			System.out.println("休診です");
		}else if((day == 2 || day == 5) && zone == 0) {
			System.out.println("休診です");
		}else if(day == 3 && zone == 2) {
			System.out.println("休診です");
		}else if(day == 6 && (zone == 1 || zone == 2)) {
			System.out.println("休診です");
		}else {
			System.out.println("診察");
		}
		
	}

}
