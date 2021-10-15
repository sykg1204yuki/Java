package Chapter.Phone;

public interface Flying {
	public void fly();
	
	default void powerOff() {
		System.out.println("飛んでいる場合は落下します。");
	}
}
