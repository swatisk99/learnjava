package strings;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int i=str.length()-1;
		String newString=new String();
		while(i>=0)
		{	newString+=str.charAt(i--);
		}
		System.out.print("Reverse of "+str+" is "+newString);
	}
}
