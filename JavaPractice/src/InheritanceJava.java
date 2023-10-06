class ParentC{
	public void display() {
		System.out.println("Hi there");
	}
	
}
class Vehicle extends ParentC{
	public Vehicle(){
		System.out.println("This is a Vehicle Class");
	}
}


class DerivedClass extends Vehicle{
	
	public void show() {
		System.out.println("This is a derived class");
	}
	
}

public class InheritanceJava {
	public static void main(String[] args) {
		DerivedClass obj = new DerivedClass();
		obj
	}

}
