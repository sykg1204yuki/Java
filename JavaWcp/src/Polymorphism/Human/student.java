package Polymorphism.Human;

public class student extends human {
	private int score;
	
	public student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}
