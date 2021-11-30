package Practice;

public class Multiplier {
	public static void main(String[] args) {
		//乗数計算
		
		int x = 3;
		
		//関数を使用：(int) Math.pow(変数、乗数）
		int x11 = (int) Math.pow(x, 1);
		int x22 = (int) Math.pow(x, 2);
		int x33 = (int) Math.pow(x, 3);
		
		
		System.out.println(x11 + "," + x22 + "," + x33);
	}

}
