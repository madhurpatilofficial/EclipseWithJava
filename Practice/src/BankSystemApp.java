import java.util.*;

class Bank{
	
	int balance = 10000;
	public void checkBalance(){
		System.out.println("You have available balance of: " + balance);
	}
	
	public void withdrawMoney(int totalw){
		if (balance > totalw) {
			balance = balance - totalw;
			System.out.println("Withdraw Sucessfull!!!");
		}
		else {
			System.out.println("Withdraw Amount Excedded!!!");
		}
	}
	
	public void depositMoney(int totald) {
		balance = balance + totald;
		
		System.out.println("Deposited sucessfully!!!");
	}
}

public class BankSystemApp {
	public static void main(String[] args) {
		Bank obj = new Bank();
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
		System.out.print("Enter your Choice: \n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
			obj.checkBalance();
			break;
		case 2: 
			System.out.print("Enter Money to withdraw: ");
			int totalw = sc.nextInt();
			obj.withdrawMoney(totalw);
			break;
		case 3:
			System.out.print("Enter amount to deposit: ");
			int totald = sc.nextInt();
			obj.depositMoney(totald);
			break;
		case 4:
			return;
		
			default:
				System.out.println("Invalid Input!!!");
			}		
		}
	}
}