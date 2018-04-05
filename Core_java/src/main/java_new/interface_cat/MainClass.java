package main.java_new.interface_cat;

public class MainClass 
{
	
	public static void main(String[] args) {
	
		
		AnimalSimulator as=new AnimalSimulator();
		Cat c=new Cat();
		Dog d=new Dog();
		
		
		as.makeNoise(c);
		as.makeNoise(d);
	}
	
	
}
