package Polymorphism.Human;

public class employee extends human {
	private String department;
	
	public employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	@Override
	public String getProfile() {
		String profile = "年齢は" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}
