package pertemuan6;

public class bird extends animal implements animalFly{

	public bird(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	public void flying() {
		System.out.println("Bird is flying...");
	}
	
	
	
}
