package Chapter.Phone;

public interface phone {
	int Max_NUMBER_DIGITS = 11;
	
	public void call(String number);
	
	default void powerOff() {
		System.out.println("電源を切ります。");
	}

}
