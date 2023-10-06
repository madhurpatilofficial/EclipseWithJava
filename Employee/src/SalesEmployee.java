

public class SalesEmployee extends Employee{
	private int sales;
	private double commission;
	private double netSalary;
	
	public SalesEmployee() {
		System.out.println("Default constructor of SalesEmployee is called");
		this.sales=0;
		this.commission=0;
		this.netSalary=0;
	}

	public SalesEmployee(int empId,String empName,int salary,int sales) {
		super(empId,empName,salary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales = sales;
		this.commission = 0;
		this.netSalary = 0;
	}
	
	
	public String toString() {
		return super.toString()+ "Sales "+this.sales+" Commission "+this.commission+" Net Salary"+this.netSalary;
	}
	
	public void checkSalary() {
		if (sales<500) {
			commission = getSal() * 0.05;
		}
		else if(sales>=5000 && sales <1000) {
			commission  = getSal() * 0.07;
			
		}
		else if(sales>1000 && sales <15000) {
			commission  = getSal() * 0.10;
		}
		else if(sales>=1500) {
			commission = getSal() * 0.15;
		}
		else {
			System.out.println("Not allowed");
		}
		netSalary = getSal() + commission;
	}
}