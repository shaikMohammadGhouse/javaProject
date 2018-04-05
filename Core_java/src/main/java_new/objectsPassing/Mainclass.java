package main.java_new.objectsPassing;

public class Mainclass 
{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStdId(123);
		s1.setStdMarks(68.98);
		s1.setStdName("shaik");
		
		
		
		Student s2=new Student(124,72.45,"shaik123");
		
		Government g1=new Government();
		
		g1.Scholarship(s1,s1.getStdMarks());
		
		g1.Scholarship(s2,s2.getStdMarks());
	}
}
