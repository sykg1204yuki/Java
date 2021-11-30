package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class In {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("年齢を教えてください：");
		int age = Integer.parseInt(br.readLine());
		System.out.println("生まれてから今まで、およそ" + (age * 365) + "日です");
	}

}
