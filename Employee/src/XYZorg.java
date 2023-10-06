import java.util.*;
public class XYZorg {

	public static void main(String[] args) {
      Calculate obj = new Calculate();
      obj.FindWages();
	}
}
		
//		SalesEmployee se1=new SalesEmployee(101,"Eshan",10000,5000);
//		se1.checkSalary();
		
//		EmpDetails e1 = new EmpDetails(10);
//		
//		SalesEmployee s1 = new SalesEmployee(200, "Madhur", 23455, 5000);
//		s1.checkSalary();
//		
//		SalesEmployee s2=new SalesEmployee(102,"Tanish",20000,5656);
//		s2.checkSalary();
//		
//		SalesEmployee s3=new SalesEmployee(103,"Manish",30000,3456);
//		s3.checkSalary();
//		
//		
//		SalesEmployee s4= new SalesEmployee(104,"Kanish",40000,6656);
//		s4.checkSalary();
//				
//		SalesEmployee s5=new SalesEmployee(105,"Vanish",50000,4544);
//		s5.checkSalary();
//		
//		
//		e1.push(s1);
//		e1.push(s2);
//		e1.push(s3);
//		e1.push(s4);
//		e1.push(s5);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//
//		
//		ArrayList<Employee> empList = new ArrayList<Employee>();
//		Scanner sc = new Scanner(System.in);
//		
//		char ch;
//
//		
//		do {
//			System.out.print("1.Add new Record\n 2.Display record\n 3. Delete");
//
//			int choice = sc.nextInt();
//			int flag = 0;
//			switch (choice) {
//			
//			//case 1 to add records
//			case 1:
//				System.out.print("Emp id: ");
//				int id = sc.nextInt();
//				
//				System.out.print("Emp name: ");
//				String name = sc.next();
//				
//				System.out.print("Emp salary: ");
//				int sal = sc.nextInt();
//				
//				//from here it knows that empName means name, empId means id etc
//				empList.add(new Employee(id, name, sal));
//				System.out.println("Record Added");
//				break;
//				
//				
//			case 2:
//				//case 2 display records
//				System.out.println("Display Records: ");
//				for(Employee emp : empList) {
//					System.out.println(emp);
//				}
//				break;
//			
//			case 3:
//				//delete records
//				System.out.println("Enter name to delete: ");
//				String nm = sc.next();
//				
//				for (int i=0;i<=empList.size();i++) {
//					if (empList.get(i).getName().equals(nm)) {
//						empList.remove(i);
//						System.out.println("Successfully Deleted");
//						flag = 1;
//						break;
//					}
//				}
//				if (flag == 0) {
//					System.out.println("Record Not Available");
//				}
//				break;
//			
//			case 4:
//				System.out.println("a.] Update Name\n b.\n Update Salary");
//				int flag1 = 0;
//				int choice1 = sc.nextInt();
//				switch (choice1) {
//				case 1:
//					System.out.println("Enter old name");
//					String nmOld = sc.next();
//					for(int i=0;i<=empList.size();i++) {
//						if(empList.get(i).getName().equals(nmOld)) {
//							System.out.println("Enter new name: ");
//							String nmNew = sc.next();
//							empList.get(i).setName(nmNew);
//							System.out.println("Update Successful");
//							flag1 = 1;
//							break;			
//						}
//					}
//					if (flag1!=0) {
//						System.out.println("Record Not found");
//					}
//					break;					
//				
//				case 2:
//					System.out.println("Provide Increment");
//					System.out.println("Enter salary condition");
//					int checkSal = sc.nextInt();
//					System.out.println("Enter increment value");
//					int incrementPer = sc.nextInt();
//					
//					for(int i=0;i<empList.size();i++) {
//						if(empList.get(i).getSal()<checkSal) {
//							empList.get(i).setSal(empList.get(i).getSal()*(incrementPer/100+1));		
//						}
//					}
//					
//					break;										
//				}
//				
//			default:
//				System.out.println("Invalid");
//				break;
//				
//			}
//			
//			System.out.println("Enter Y to continue");
//			ch=sc.next().charAt(0);
//			
//		}
//		while(ch =='y' || ch == 'Y');
//		System.out.println("done");
//	
//
//	}
//}

