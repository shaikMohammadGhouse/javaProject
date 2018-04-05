package main.java_new.aadhar;

public class MainClass 
{
	public static void main(String[] args) {

		Government gov=new Government();
		
		Person p1=new Person();
		Employee p2=new Employee();
		
		
		p2.setAge(12);
		p2.setEid(101);
		p2.setName("shaik");
		p2.setSalary(4578.09);
		
		
		gov.enrollAdhaar(p2);	
		
		
		System.out.println("\n\n\n");
		
		p1.setAge(12);
		p1.setName("shaikingu");
		gov.enrollAdhaar(p1);	
		

		System.out.println("\n\n\n");
		
		
		
		
		Student s1=new Student();
		s1.setAge(20);
		s1.setName("shaik123");
		s1.setMarks(69.98);
		s1.setSid(1001);
		
		gov.scholorship(s1, s1.getMarks());
		

		System.out.println("\n\n\n");
		
		
		gov.enrollAdhaar(s1);
	

		System.out.println("\n\n\n");
		
	}
	
	

	
	
	
}
