package assignmentPackage3;
/*
 * Assignment 8:- WAP to accept a name and search character from user and print at which index the character is 
		occuring
 */
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		String name = sc.nextLine();
		System.out.println("Input character to search for: ");
		char ch = sc.next().charAt(0);
		sc.close();
		int index = name.indexOf(ch);
		if (index == -1) {
			System.out.println(ch + " is not present in " + name);
		}
		else {
			System.out.println(ch + " is present in " + name + " at index " + index);
		}
		
	}

}
