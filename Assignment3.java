package assignmentPackage3;
/*
 * Assignment 3 :- WAP to accept 3 values in an array and store the square of it in another array and print 
		original numbers and their squares using array
 */
import java.util.Scanner;

public class Assignment3 {
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
		
		int[] squares = new int[]{arr[0]*arr[0],arr[1]*arr[1],arr[2]*arr[2]};
		for(int i = 0; i < 3; i++) {
			System.out.println("Original: " + arr[i] + "\tSquare: " + squares[i]);
		}
	}
}
