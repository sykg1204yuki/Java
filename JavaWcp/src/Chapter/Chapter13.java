package Chapter;

import Chapter.Phone.FlyingPhone;
import Chapter.Phone.mobilephone;
import Chapter.Phone.phone;

public class Chapter13 {
	public static void main(String[] args) {
		mobilephone mobilephone = new mobilephone("000-1111-2222");
		mobilephone.takePicture();
		Chapter13.staticCall(mobilephone, "99-8888-7777");
		mobilephone.powerOff();
		
		FlyingPhone flyingPhone = new FlyingPhone(5);
		flyingPhone.fly();
		Chapter13.staticCall(flyingPhone, "000-1111-2222");
		flyingPhone.powerOff();
	}
	
	public static void staticCall(phone phone, String number) {
		phone.call(number);
	}

}
