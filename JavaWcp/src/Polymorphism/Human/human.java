package Polymorphism.Human;

public class human {
	private String name;
	protected int age;
	
	public human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	final public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getProfile() {
		return "名前は" + this.name + "、年齢は" + this.age + "です。";
	}

}
