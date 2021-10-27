package Practice;

public class oddSum {
	public static void main(String[] args) {
		int total = 0;
		
		for (int num = 1; num <= 100; num++) {
			if (num%2 == 1) {
				System.out.println(num);
				total += num;
			}else {
				continue;
			}
		}
		System.out.println(total);
	}

}
