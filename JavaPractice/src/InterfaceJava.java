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

public class InterfaceJava {
	public static void main(String[] args) {
		dc obj = new dc();
		obj.showList();		
		obj.multiple();
		
	}
}