package Interface;

import Interface.Tool.camera;
import Interface.Tool.mobilephone;

public class interface01 {
	public static void main(String[] args) {
		mobilephone mobilePhone = new mobilephone("000-1111-2222");
		
		System.out.println("電話番号は最大" + mobilephone.Max_NUMBER_DIGITS + "桁です。");
		mobilePhone.call("99-8888-7777");
		interface01.classTakePicture(mobilePhone);
	}
	
	public static void classTakePicture(camera camera) {
		camera.takePicture();
	}

}
