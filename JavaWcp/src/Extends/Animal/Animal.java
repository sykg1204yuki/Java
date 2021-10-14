package Extends.Animal;

public abstract class Animal {
	protected String name;
	
	public void eat() {
		System.out.println(name + "が食事をしました！");
		
	}
	
	public abstract void cry();

}
