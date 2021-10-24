package Progate;

public class Person {
	public static void printData(String firstName, String lastName, int age, double height, double weight){
	    System.out.println("名前は" + fullName(firstName, lastName) + "です");
	    System.out.println("年齢は" + age + "歳です");
	    if (age >= 20){
	      System.out.println("成年者です");
	    }else{
	      System.out.println("未成年者です");
	    }
	    System.out.println("身長は" + height + "mです");
	    System.out.println("体重は" + weight + "kgです");
	    double bmi = bmi(height, weight);
	    System.out.println("BMIは" + Math.round(bmi) + "です");
	    
	  }
	  
	  public static String fullName(String firstName, String lastName){
	    return firstName + " " + lastName;
	  }
	  
	  public static double bmi(double height, double weight){
	    return weight / height / height;
	  }
}
