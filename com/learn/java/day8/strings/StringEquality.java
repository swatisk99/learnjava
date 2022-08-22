package learn.java.day8.strings;
import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1 = s.nextLine();
		System.out.println("Enter 2nd string");
		String str2 = s.nextLine();
		int i;
		if(str1.length()!=str2.length())
			System.out.print("Strings are not equal");
		else {
			for(i=0;i<str1.length();i++)
			{	if(str1.charAt(i)!=str2.charAt(i)) {
					System.out.print("Strings are not equal");
					break;
				}
			}if(i==str1.length())
				System.out.print("both strings are equal");
		}
		
	}

}
