package animal;

public abstract class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void speak();
	
	public void setAge(int newAge) {
		if(newAge > 0) {
			age = newAge;				
		}
	}
	public int getAge() {
		return age;
	}
	public String getAllData() {
		return "I am a " + this.getClass().getSimpleName() 
				+ " name: " + name + " age: " + age;
	}
}
