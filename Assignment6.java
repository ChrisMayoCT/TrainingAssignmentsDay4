package assignmentPackage3;
/*
 * Assignment 6:- WAP to create 2 array and store 3 values in each array and store the uncommon values from both the
		array in another array and print them.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		int[] arr1= new int[3];
		System.out.println("Add 3 integer values.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Value 1: ");
		arr1[0] = sc.nextInt();
		System.out.println("Value 2: ");
		arr1[1] = sc.nextInt();
		System.out.println("Value 3: ");
		arr1[2] = sc.nextInt();
		
		int[] arr2= new int[3];
		System.out.println("Add 3 more integer values.");
		System.out.println("Value 1: ");
		arr2[0] = sc.nextInt();
		System.out.println("Value 2: ");
		arr2[1] = sc.nextInt();
		System.out.println("Value 3: ");
		arr2[2] = sc.nextInt();
		sc.close();
		
		boolean[] a1b = new boolean[3];
		boolean[] a2b = new boolean[3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr1[i] == arr2[j]) {
					a1b[i] = true;
					a2b[j] = true;
				}
			}
		}
		
		int size = 0;
		for(int i = 0; i < 3; i++) {
			if(a1b[i] == false) {
				size += 1;
			}
			if(a2b[i] == false) {
				size += 1;
			}
		}
		
		int[] arrToRet = new int[size];
		int index = 0;
		
		for(int i = 0; i < 3; i++) {
			if(a1b[i] == false) {
				arrToRet[index] = arr1[i];
				index += 1;
			}
			if(a2b[i] == false) {
				arrToRet[index] = arr2[i];
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(arrToRet));
	}

}
