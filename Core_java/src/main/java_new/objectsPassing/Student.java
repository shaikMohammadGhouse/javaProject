package main.java_new.objectsPassing;

public class Student 
{
	int stdId;
	String stdName;
	double stdMarks;
	
	public Student() {
		
	}
	public Student(int stdId, double stdMarks, String stdName) {
		
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdMarks = stdMarks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
	}
	
	
	
}
