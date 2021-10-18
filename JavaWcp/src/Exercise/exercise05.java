package Exercise;

public class exercise05 {
	public static void main(String[] args) {
		long long1 = 987654321L;
		//longを使用する際は、最後に"L"を明示しないとコンパイルエラーになる
		System.out.println(long1);
		
		double double1 = 1234.56d;
		//最後の"d"は明示しなくても良い
		System.out.println(double1);
		
		boolean boolean1 = true;
		System.out.println(boolean1);
		
		Integer i = 100;
		System.out.println(i);
		
		Float f = 1.2345f;
		//最後に"f"を明示する
		System.out.println(f);
		
		Character c = 'こ';
		System.out.println(c);
		
		int[] array1 = new int[] {1,2,3,4,5};
		System.out.println(array1[3]);
	}

}
