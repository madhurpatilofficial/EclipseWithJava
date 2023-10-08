import java.util.Scanner;

class Calculate {
    private int noOfWorkingHours;
    private int noOfDayInMonth;
    private int perDaySalary;
    private int perHourSalary;
    private int netSalary;

    Scanner sc = new Scanner(System.in);

    public Calculate() {
        // Constructor with no parameters
    }

    public void FindWages() {
        System.out.print("Enter Working Hours: ");
        noOfWorkingHours = sc.nextInt();
        noOfDayInMonth = 31;
        System.out.println("Number of Days in a month: " + noOfDayInMonth);

        perDaySalary = 10000 / noOfDayInMonth;
        System.out.print("Per day Salary: " + perDaySalary);

        perHourSalary = perDaySalary / 8;
        System.out.print("Per hour Salary: " + perHourSalary);

        netSalary = perHourSalary * noOfWorkingHours;
        System.out.print("Net Salary: " + netSalary);
    }
}

public class CalculateSalary {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.FindWages();
    }
}
