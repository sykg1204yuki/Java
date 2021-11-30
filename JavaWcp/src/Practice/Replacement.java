package Practice;

public class Replacement {
	public static void main(String[] args) {
		//変数置換
		
		int x = 4;
		int y = 6;
		
		System.out.println("x=" + x + ",y=" + y);
		
		int w = x;
		//もう一つ変数ｗを作成し、xを代入（イメージ：ｘが空になる）
		x = y;
		
		y = w;
		
		System.out.println("x=" + x + ",y=" + y);
	}
}
