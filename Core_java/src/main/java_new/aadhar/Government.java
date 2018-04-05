package main.java_new.aadhar;

public class Government 
{
	void enrollAdhaar(Person  p)
	{
		if(p instanceof Employee)
		{
			Employee e=(Employee)p;
			System.out.println("you are enrolled as a Employee for adhaar....");
			System.out.println("Employee name:--"+p.name);
			System.out.println("salary..."+e.salary);
		}
		else if(p instanceof Student)
		{
			
			Student s=(Student)p;
			System.out.println(s.getMarks());
			if(s.age>18)
			{
				
				System.out.println("you are enrolled as a Student for adhaar....");
				System.out.println("Student name:--"+s.name);
			}
			else 
			{
				System.out.println("not elgible for adhaar");
				
			}
			
		}
	}
	
	void scholorship(Person p,double marks)
	{
		if(p instanceof Student)
		{
				Student s=(Student)p;		//downcast...
				
			if(s.getMarks()>70.00)
			{
				System.out.println("you zre elgible for scholarship..." );
			}
			else
			{
				System.out.println("you zre not elgible for scholarship..." );
			}
		}
	}
}
