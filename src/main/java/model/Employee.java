package model;

public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	
	//Constructors
	//Default
	public Employee() 
	{
		
	}
	
	public Employee(String name)
	{
		this.name = name;
	}
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
