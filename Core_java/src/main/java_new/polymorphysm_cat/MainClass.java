package main.java_new.polymorphysm_cat;

public class MainClass 
{
	
	public static void main(String[] args) {
	
		
		AnimalSimulator as=new AnimalSimulator();
		Animal a=new Animal();
		Cat c=new Cat();
		Dog d=new Dog();
		
		
		as.makeNoise(c);
		as.makeNoise(d);
	}
	
	
}
