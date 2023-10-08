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
		imple obj = new imple();
		obj.showParentDetails();
	}

}
