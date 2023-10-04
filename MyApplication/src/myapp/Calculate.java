package myapp;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number please: ");
		int number = sc.nextInt();
		if (number%2==0){
			System.out.println(number + " is Even");
		}
		else {
			System.out.println(number + " is Odd");
		}
		sc.close();
	}
}