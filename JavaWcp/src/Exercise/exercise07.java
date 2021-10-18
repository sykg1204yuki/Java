package Exercise;

public class exercise07 {
	public static void main(String[] args) {
		int km = 7;
		if (km <= 5) {
			System.out.println("とても近いです");
		}else if ((km > 5) && (km <= 10)){
			System.out.println("近いです");
		}else if ((10 > km) && (km <= 15)) {
			System.out.println("遠いです");
		}else {
			System.out.println("とても遠いです");
		}
		
		
		String color = "green";
		
		switch(color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}

}
