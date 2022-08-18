import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int i=0;
		System.out.print("Enter character to be found : ");
		char character=s.next().charAt(0);
		boolean charPresent=true;
		while(i<str.length())
		{	if(str.charAt(i++)==character) {
				System.out.print("Position of the "+character+" is : "+i);
				charPresent=true;
				break;
			}
			else
				charPresent=false;
		}
		if(!charPresent)
			System.out.print(character+"is not present in string");
	}

}
