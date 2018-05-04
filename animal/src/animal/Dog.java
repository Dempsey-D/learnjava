package animal;

public class Dog extends Animal {
	private String toy;
	public Dog(String toy, String name, int age){
		super(name, age);
		this.toy = toy;
	}
	
	public void speak() {
		System.out.println("woof");
	}
	
	public String getToy() 
	{
		return toy;
	}
	public String getAllData() {
		return super.getAllData() + " I like my " + toy;
	}
}
