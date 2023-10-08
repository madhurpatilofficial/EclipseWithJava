interface fc{
	public void showList();
}

interface fc2{
	public void multiple();
}

class dc implements fc, fc2{
	@Override
	public void showList() {
		System.out.println("Interface Implemented in Derived Class");	
	}
	@Override
	public void multiple() {
		System.out.println("ok done");
	}
}

interface Parent{
	void showParentDetails();
}

interface DerivedInter extends Parent{
	void displayDerived();
}

class imple implements DerivedInter{
	@Override
	public void showParentDetails() {
		System.out.println("Print Details");
		
	}
	@Override
	public void displayDerived() {
		System.out.println("Displayed Info");
		
	}
}

public class InterfaceJava {
	public static void main(String[] args) {
		dc obj = new dc();
		obj.showList();		
		obj.multiple();
		imple obj1 = new imple();
		obj1.showParentDetails();
	}
}