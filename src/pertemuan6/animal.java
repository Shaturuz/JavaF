package pertemuan6;

public abstract class animal {

	private String name;
	public int age;
	
	// alt + shift + s
	public animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void eat();
	
	public void sound() {
		System.out.println("Animal is making sound...");
	}
	
	// alt + shift + s + r
	
	
	

}
