package pertemuan6;

import java.util.*;

public class polymorphism {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public String generateData(String firstname, String lastname) {
		return firstname + lastname;
	}
	
	// overloaded 
	public String generateData(int age, String firstname) {
		return firstname + Integer.toString(age);
	}
	
	public String generateData(String firstname, int age) {
		return "Name" + firstname + Integer.toString(age);
	}
	
	public polymorphism(){
		
		String fname = "Doni";
		String lname = "Setia";
		
		System.out.println(generateData(fname, lname));
		System.out.println(generateData("Dadi", 18));
		System.out.println(generateData(15, "Dida"));
		
//		animal animal1 = new animal("Animal 1", 15);
//		animal1.eat();
//		animal1.sound();
		
		Vector<animal> animalList = new Vector<>();
		
		cat cat1 = new cat("Any", 3);
		cat1.eat();
		cat1.sound();
		
		dog dog1 = new dog("Dog 1", 4);
		dog1.eat();
		dog1.sound();
		
		animalList.add(cat1);
		animalList.add(dog1);
		
	}
	

	public static void main(String[] args) {
		new polymorphism();
	}

}
