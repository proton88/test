package by.epam.proton.animals;

public class Dog extends Animal{

	@Override
	public void play() {
		System.out.println("Dog is playing");
	}

	@Override
	public void voice() {
		System.out.println("Gav-gav");
	}
}
