package assignmentPackage3;
/*
 * Assignment 2:- WAP to create as array with 3 values and print the sum of values on odd indexes
 */
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println("Add 3 integer values.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Value 1: ");
		arr[0] = sc.nextInt();
		System.out.println("Value 2: ");
		arr[1] = sc.nextInt();
		System.out.println("Value 3: ");
		arr[2] = sc.nextInt();
		sc.close();
		
		System.out.println(arr[0] + arr[2]); // I assume the question meant even indexes?
	}
}
