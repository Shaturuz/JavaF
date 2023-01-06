package pertemuan6;

public class cat extends animal{
	
	public cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating...");
	}
	
	// overriding
//	public void eat() {
//		System.out.println("Cat is eating");
//	}
	
//	public void sound() {
//		System.out.println("Cat is making sound...");
//	}

}
