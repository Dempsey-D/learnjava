package animal;

import java.util.ArrayList;
import java.util.List;

public class Hello {
	public static void main(String[] args) {
		Dog d0 = new Dog("ball","andy",1);
		Cat c0 = new Cat("scum","Dandy",11);
		Dog d1 = new Dog("bone","brian",45);
		Cat c1 = new Cat("fish","ned",23);
		
		
		List<Animal> aList = new ArrayList<Animal>();
		
		aList.add(c0);
		aList.add(c1);
		aList.add(d0);
		aList.add(d1);
		c1.pounce();
		for(Animal a : aList) 
		{
			System.out.println(a.getAllData());
			a.speak();
		}
	}
}

