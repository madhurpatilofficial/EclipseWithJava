package www.arrlist.com;
import java.util.*;

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
    	return id + " " + name + " "+ salary;
    }
    //getters
    public int getId() {
    	return this.id;
    }
    public String getName() {
    	return this.name;
    }
    public int getSalary() {
    	return this.salary;
    }
    
    
    //setters
    public void setId(int salary){
    	this.salary = salary;
    }
    public void setName(String name){
    	this.name = name;
    }
    public void setSal(int salary) {
    	this.salary = salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        System.out.println("------Enter Details-----");
        
        int empId;
        String empName;
        int empSalary;

        System.out.print("Enter Id: ");
        empId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Salary: ");
        empSalary = sc.nextInt();

        // Create an Employee object with the entered details
        Employee employee = new Employee(empId, empName, empSalary);

        // Add the employee to the ArrayList
        empList.add(employee);
        
        //Display records through toString Method
        System.out.println(employee);
        
        //Display records using getters
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        
        
        //update record
        System.out.print("Enter the ID of the employee you want to update: ");
        int updateId = sc.nextInt();

        for (Employee emp : empList) {
            if (emp.getId() == updateId) {
                System.out.print("Enter new Name: ");
                String updatedName = sc.nextLine();
                emp.setName(updatedName);

                System.out.print("Enter new Salary: ");
                int updatedSalary = sc.nextInt();
                emp.setSal(updatedSalary);

                System.out.println("Employee record updated successfully.");
                System.out.println(emp);
                break; // Exit the loop once the employee is updated
            }
        }
        System.out.println("Enter Id to be deleted");
        int delId = sc.nextInt();
        for (Employee emp : empList) {
        	if(emp.getId() == delId) {
        		empList.remove(emp);
        		System.out.println("Deleted Sucessfully");
        	}
        }
    }
}
