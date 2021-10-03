package Practice;

public class For01 {
	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
		for (int number = 1; number <= 50; number++) {
			if ((number %3 == 0) && (number %5 == 0)) {
				System.out.println("FizzBuzz");
			}else if (number %5 == 0) {
				System.out.println("Buzz");
			}else if (number %3 == 0){
				System.out.println("Fizz");
			}else {
				System.out.println(number);
			}
		}
		
	}
}
