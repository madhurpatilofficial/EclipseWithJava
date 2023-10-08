import java.util.*;

public class JavaArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("Hi there");
//		System.out.println(arr.length);
//		int a = 1;
//		for(int i : arr) {
//			System.out.println(a  + ".]" + i);
//			a++;
//		}	
//		int count = 1;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(count + ".)" + arr[i]);
//			count++;
//		}
		//taking array as a input from user
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter: ");
			arr[i] = sc.nextInt();
		}
		//display all array elements using enhanced for loop
		for(int all : arr) {
			System.out.println(all);
		}
	}
}