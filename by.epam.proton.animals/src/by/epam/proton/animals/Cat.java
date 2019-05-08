package by.epam.proton.animals;

public class Cat extends Animal{
	
	@Override
	public void play() {
		System.out.println("Cat is playing");
	}

	@Override
	public void voice() {
		System.out.println("Miau-miau");
	}

}
