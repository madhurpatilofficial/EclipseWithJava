abstract class ParentClass{
	
	public ParentClass() {
		System.out.println("Parent Constructor Called");
	}
	
	public void display() {
		System.out.println("Display abstract class");
	}
	public abstract void show();  //only declared not implemented
}

class ChildClass extends ParentClass{
	public ChildClass() {
		System.out.println("ChildClass constructor called");
	}
	
	@Override
	public void show() {
		System.out.println("Child 1 Class");
		
	}
	public void display2() {
		System.out.println("Hi madhur dhondu patil");
	}
}

class Child2Class extends ParentClass{
	@Override
	public void show() {
		System.out.println("Child 2 Class");
	}
}

public abstract class AbstractClass {
	public static void main(String[] args) {
		
		ParentClass p1 = new ChildClass(); //create object of type ChildClass with reference ParentClass
		p1.display();
		p1.show();
		
		//object type casting
		((ChildClass) p1).display2();
		
		//creating object of Child2Class with reference of parent class
		p1 = new Child2Class();
		
	}
}