import java.util.Scanner;

class Calculate extends Employee{
    private int noOfWorkingHours;
    private int noOfDayInMonth;
    private int perDaySalary;
    private int perHourSalary;
    private int netSalary;

    Scanner sc = new Scanner(System.in);


    public void FindWages() {
        System.out.print("Enter Working Hours: ");
        noOfWorkingHours = sc.nextInt();
        noOfDayInMonth = 31;
        System.out.println("Number of Days in a month: " + noOfDayInMonth);

        perDaySalary = this.getSal() / noOfDayInMonth;
        System.out.println("Per day Salary: " + perDaySalary);
        
        System.out.println(this.getSal());
        System.out.println(this.getName());

        perHourSalary = perDaySalary / 8;
        System.out.println("Per hour Salary: " + perHourSalary);

        netSalary = perHourSalary * noOfWorkingHours;
        System.out.println("Net Salary: " + netSalary);
    }
}