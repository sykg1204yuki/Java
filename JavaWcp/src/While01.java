
public class While01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
		
		int num = 1;
		while (num <= 100) {
			if ((num %3 == 0) && (num %5 == 0)) {
				System.out.println("FizzBuzz");
			}else if (num %5 == 0) {
				System.out.println("Buzz");
			}else if (num %3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(num);
			}
			num += 1;
		}
	}
}
