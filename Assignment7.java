package assignmentPackage3;
/*
 * Assignment 7:- WAP to accept a name and search character from user and print whether the character is present 
		or not
 */
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		String name = sc.nextLine();
		System.out.println("Input character to search for: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ch) {
				System.out.println(ch + " is present in the name " + name);
				return;
			}
		}
		System.out.println(ch + " is not present in the name " + name);
	}

}
