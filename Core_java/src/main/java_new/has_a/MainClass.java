package main.java_new.has_a;

public class MainClass 
{
	public static void main(String[] args) 
	{	
		
		Mobile mobile=new Mobile();
		mobile.battery.cost=145;
		mobile.screen.type="dragonglass";
	
	
	System.out.println(mobile.battery.getCost());
	System.out.println(mobile.screen.getType());
	
	}
	
}
