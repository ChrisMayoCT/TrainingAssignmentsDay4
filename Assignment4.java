package assignmentPackage3;

import java.util.Scanner;
/*
 * Assignment 4:- WAP to accept a name and print number of vowels in that name
 */
public class Assignment4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		String name = sc.nextLine();
		name = name.toUpperCase();
		sc.close();
		int vowels = 0;
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowels += 1;
			}
		}
		System.out.println("There are " + vowels + " vowels in this name.");
	}

}
