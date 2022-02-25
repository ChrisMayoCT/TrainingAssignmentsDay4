package assignmentPackage3;
/*
 * Assignment 1:- WAP to create an array with 3 values and print the greatest values from an array
 */
import java.util.Scanner;

public class Assignment1 {

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
		
		if(arr[0] >= arr[1] && arr[0] >= arr[2]) {
			System.out.println("The greatest value is: " + arr[0]);
		}
		else if(arr[1] >= arr[2]) {
			System.out.println("The greatest value is: " + arr[1]);
		}
		else {
			System.out.println("The greatest value is: " + arr[2]);
		}
	}

}
