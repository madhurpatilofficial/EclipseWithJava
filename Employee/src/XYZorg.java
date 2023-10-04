
import java.util.*;
public class XYZorg {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		char ch;

		
		do {
			System.out.print("1.Add new Record\n 2.Display record\n 3. Delete");

			int choice = sc.nextInt();
			int flag = 0;
			switch (choice) {
			
			case 1:
				System.out.print("Emp id: ");
				int id = sc.nextInt();
				
				System.out.print("Emp name: ");
				String name = sc.next();
				
				System.out.print("Emp salary: ");
				int sal = sc.nextInt();
				
				empList.add(new Employee(id, name, sal));
				System.out.println("Record Added");
				break;
				
				
			case 2:
				System.out.println("Display Records: ");
				for(Employee emp : empList) {
					System.out.println(emp);
				}
				break;
			
			case 3:
				System.out.println("Enter name to delete: ");
				String nm = sc.next();
				
				for (int i=0;i<=empList.size();i++) {
					if (empList.get(i).getName().equals(nm)) {
						empList.remove(i);
						System.out.println("Successfully Deleted");
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.println("Record Not Available");
				}
				break;
			
			case 4:
				System.out.println("a.] Update Name\n b.\n Update Salary");
				int flag1 = 0;
				int choice1 = sc.nextInt();
				switch (choice1) {
				case 1:
					System.out.println("Enter old name");
					String nmOld = sc.next();
					for(int i=0;i<=empList.size();i++) {
						if(empList.get(i).getName().equals(nmOld)) {
							System.out.println("Enter new name: ");
							String nmNew = sc.next();
							empList.get(i).setName(nmNew);
							System.out.println("Update Successful");
							flag1 = 1;
							break;			
						}
					}
					if (flag1!=0) {
						System.out.println("Record Not found");
					}
					break;					
				
				case 2:
					System.out.println("Provide Increment");
					System.out.println("Enter salary condition");
					int checkSal = sc.nextInt();
					System.out.println("Enter increment value");
					double incrementPer = sc.nextInt();
					
					for(int i=0;i<empList.size();i++) {
						if(empList.get(i).getSal()<checkSal) {
							empList.get(i).setSal(empList.get(i).getSal()*(incrementPer/100+1));		
						}
					}
					
					break;										
				}
				
			default:
				System.out.println("Invalid");
				break;
				
			}
			
			System.out.println("Enter Y to continue");
			ch=sc.next().charAt(0);
			
		}
		while(ch =='y' || ch == 'Y');
		System.out.println("done");
	

	}

}