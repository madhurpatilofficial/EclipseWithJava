abstract class AbClass{
	//concrete method or non-abstract or instantiated method
	public void showAll() {
		System.out.println("Hi there!!");
	}
	//abstract method
	public abstract void display();
	
	public AbClass(){
		System.out.println("Abstract Class Constructor Called");
	}
}
class Derived extends AbClass{

	@Override
	public void display() {
		System.out.println("This is a Unimplemented method");
		
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		//creating object of derived class with AbClass as a reference
		AbClass obj = new Derived();
		obj.display();
		obj.showAll();
	}
}