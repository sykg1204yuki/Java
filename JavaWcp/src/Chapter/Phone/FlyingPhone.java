package Chapter.Phone;

public class FlyingPhone implements phone,Flying {
	private int time;
	
	public FlyingPhone(int time) {
		this.time = time;
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	public void fly() {
		System.out.println(time + "分間、飛びます。");
	}
	
	public void powerOff() {
		Flying.super.powerOff();
	}

}
