import java.util.ArrayList;

class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee() {
        System.out.println("Default Constructor Called");
        this.empId = 0;
        this.empName = "";
        this.salary = 0;
    }

    public Employee(int empId, String empName, double salary) {
        System.out.println("Parameterized Constructor Called");
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String toString() {
        return "EmpId " + this.empId + " EmpName " + this.empName + " EmpSalary " + this.salary;
    }
}

class Organization {
    private String orgName;
    private String orgLocation;
    
    private ArrayList<Employee> empList = new ArrayList<Employee>();

    public Organization() {
        System.out.println("Default constructor of org called");
        this.orgName = "";
        this.orgLocation = "";
        this.empList = new ArrayList<>();
    }

    public Organization(String orgName, String orgLocation) {
        System.out.println("Parameterized constructor of org called");
        this.orgName = orgName;
        this.orgLocation = orgLocation;
        this.empList = new ArrayList<>();
    }

    //add employee
    public void addEmployee(Employee employee) {
        empList.add(employee);
    }

//    remove employee
    public void removeEmployee(Employee employee) {
        empList.remove(employee);
    }

    public String toString() {
        return empList.toString() + " OrgName " + this.orgName + " Org Location " + this.orgLocation;
    }
}

public class Containment {
    public static void main(String[] args) {
        Organization org1 = new Organization(" MyOrg ", " Pune ");
        System.out.println(org1);

        Employee employee1 = new Employee(101, " Madhur ", 1000);
        Employee employee2 = new Employee(102, " Bunty ", 2000);

        org1.addEmployee(employee1);
        org1.addEmployee(employee2);

        System.out.println("Updated Organization:");
        System.out.println(org1);

//        org1.removeEmployee(employee1);
//        System.out.println("Organization after removing employee:");
//        System.out.println(org1);
    }
}
