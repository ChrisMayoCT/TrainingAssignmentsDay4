package assignmentPackage3;

import java.util.Scanner;
/*
 * Assignment 5:- WAP to store 5 values in array variable and find out second lowest number from the array
 */
public class Assignment5 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Add 5 integer values.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Value 1: ");
		arr[0] = sc.nextInt();
		System.out.println("Value 2: ");
		arr[1] = sc.nextInt();
		System.out.println("Value 3: ");
		arr[2] = sc.nextInt();
		System.out.println("Value 4: ");
		arr[3] = sc.nextInt();
		System.out.println("Value 5: ");
		arr[4] = sc.nextInt();
		sc.close();
		
		int lowest, secondLowest;
		if(arr[0] >= arr[1]) {
			lowest = arr[1];
			secondLowest = arr[0];
		}
		else {
			lowest = arr[0];
			secondLowest = arr[1];
		}
		for(int i = 2; i < 5; i++) {
			int testVal = arr[i];
			if(testVal <= lowest) {
				secondLowest = lowest;
				lowest = testVal;
			}
			else if(testVal <= secondLowest) {
				secondLowest = testVal;
			}
		}
		System.out.println("The second smallest value is " + secondLowest);
	}

}
