class ParentClass{
	int id;
	String name;
	int salary;
	
	public ParentClass() {
		System.out.println("This is a Default Constructor");
	}
	public ParentClass(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void showDetails() {
		System.out.println("Id: " + id + " Name: " + name + " Salary: " + salary);
	}
}

public class ObjectOrientedProgramming {
	public static void main(String[] args) {
		ParentClass obj = new ParentClass(21,"madhur",12344);
		obj.showDetails();
		
	}
}
