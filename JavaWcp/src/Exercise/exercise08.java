package Exercise;

public class exercise08 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		
		int[] array = new int[] {1,2,3,4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int val : array) {
			if(val%2 == 0) {
				continue;
			}
			System.out.println(val);
		}
		
		int number;
		for (number = 1; number <= 100; number++) {
			if ((number%3 == 0) && (number%5 == 0)){
				System.out.println(number + ":FizzBuzz");
			}else if (number%3 == 0) {
				System.out.println(number + ":Fizz");
			}else if (number%5 == 0) {
				System.out.println(number + ":Buzz");
			}else {
				System.out.println(number);
			}
		}
	}

}
