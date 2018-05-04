package animal;

public class Cat extends Animal {
	String food;
	public Cat(String food, String name, int age) {
		super(name,age);
		this.food = food;
	}
	
	public void speak() {
		System.out.println("meow");

	}

	public String getFood() {
		return food;
	}
	public String getAllData() {
		return super.getAllData() + " I eat " + food;
	}
	
	public void pounce() {
		System.out.println("POUNCE MUTHAFUCKA");
	}
}
