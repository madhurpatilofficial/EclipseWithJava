package com.training.org;


class ParentClass{
	
	private int aVal;
	public ParentClass() {
		System.out.println("Default constructor of ParentClass is called");
		aVal=0;
	}
	
	public ParentClass(int aVal) {
		System.out.println("Parameterised constructor of ParentClass is called");
		this.aVal=aVal;
	}
	
	public void showParentDetails() {
		System.out.println("showParentDetails from Parent Class is called:- " +aVal);
	}
	
}

class ChildClass extends ParentClass{
	private int bVal;
	
	public ChildClass() {
		System.out.println("Default constructor of ChildClass is called");
		bVal=0;
	}
	
	public ChildClass(int aVal,int bVal) {
		super(aVal);  //this is calling ParentClass parameterised constructor
		System.out.println("Parameterised constructor of ChildClass is called");
		this.bVal=bVal;
	}
	
	public void showChildDetails() {
		super.showParentDetails();

		System.out.println("showChildDetails from Child class is called:-  "+bVal);
	}
	
}



public class InheritanceExample {
	public static void main(String[] args) {
		ChildClass c1=new ChildClass(100,200);
		c1.showChildDetails();
	}
}