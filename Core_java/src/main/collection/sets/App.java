package main.collection.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App
{
	
	public static void main(String[] args)
	{
	
		
		Set<String> set1=new LinkedHashSet<String>();
		
		set1.add("mouse");
		
		set1.add("cat");
		set1.add("dog");
		set1.add("bear");
		
		
		
		set1.add("mouse");
		
		
		System.out.println(set1);
		
		
		
		
		
		
Set<String> set2=new HashSet<String>();
		
		set2.add("mouse");
		
		set2.add("cat");
		set2.add("dog");
		set2.add("bear");
		
		
		
		set2.add("mouse");
		
		
		System.out.println(set2);

	
	
	
	Set<String> set3=new TreeSet<String>();
	
	set3.add("mouse");
	
	set3.add("cat");
	set3.add("dog");
	set3.add("bear");
	
	
	
	set3.add("mouse");
	
	
	System.out.println(set3);
	
	
	for (String element : set3) {
		System.out.println(element);
	}
	
}



	
}
