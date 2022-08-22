package strings;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.nextLine();
		int index=0,halfIndex;
		if(str.length()%2==0)
			halfIndex=str.length()/2;
		else
			halfIndex=str.length()/2+1;
		while(index<halfIndex)
		{	if(str.charAt(index)==str.charAt(str.length()-index-1))
				index++;
			else
				break;
		}
		if(index==halfIndex)
			System.out.print(str+" is a palindrome");
		else
			System.out.print(str+" is not a palindrome");
	}

}
