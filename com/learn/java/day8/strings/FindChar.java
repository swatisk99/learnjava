package learn.java.day8.strings;
import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int i=0;
		System.out.print("Enter character to be found : ");
		char character=s.next().charAt(0),lowerCharacter=' ',upperCharacter=' ';
		if((character<=90)&&(character>=65))
			lowerCharacter=(char)(character+32);
		else if((character<=122)&&(character>=97))
			upperCharacter=(char)(character-32);
		boolean charPresent=true;
		while(i<str.length())
		{	if((str.charAt(i)==character)||(str.charAt(i)==lowerCharacter)||(str.charAt(i)==upperCharacter)) {
				System.out.print("Position of the "+character+" is : "+(++i));
				charPresent=true;
				break;
			}
			else {
				charPresent=false;i++;
			}
		}
		if(!charPresent)
			System.out.print(character+"is not present in string");
	}

}
