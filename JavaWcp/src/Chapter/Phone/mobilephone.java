package Chapter.Phone;

public class mobilephone implements phone, camera{
	private String number;
	
	public mobilephone(String number) {
		this.number = number;
	}
	
	public void takePicture() {
		System.out.print("写真をとります。");
	}
	
	public void call(String number) {
		System.out.println(this.number + "から" + number + "に電話をかけます。");
	}

}
