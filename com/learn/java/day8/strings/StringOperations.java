package strings;
import java.util.Scanner;

public class StringOperations {
	static void toTitleCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((i==0)||(str.charAt(i-1)==' ')) {
				if((str.charAt(i)>=97)&&(str.charAt(i)<=122))
					newString=newString+(char)(str.charAt(i)-32);
				else
					newString=newString+str.charAt(i);
			}
			else {
				if((str.charAt(i)<=90)&&(str.charAt(i)>=65))
					newString=newString+(char)(str.charAt(i)+32);
				else
					newString=newString+str.charAt(i);
			}i++;
		}
		System.out.print(newString);
	}
	
	static void toUpperCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((str.charAt(i)>=97)&&(str.charAt(i)<=122))
					newString=newString+(char)(str.charAt(i)-32);
			else
					newString=newString+str.charAt(i);
			i++;
		}
		System.out.print(newString);
	}
	
	static void toLowerCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((str.charAt(i)>=65)&&(str.charAt(i)<=90))
					newString=newString+(char)(str.charAt(i)+32);
			else
					newString=newString+str.charAt(i);
		i++;
		}
		System.out.print(newString);
	}
	
	static void toSentenceCase(String str) {
		int i=0;
		String newString=new String();
		while(i<str.length())
		{	if((i==0)||(str.charAt(i-1)=='.')){
				if((str.charAt(i)>=97)&&(str.charAt(i)<=122))
					newString=newString+(char)(str.charAt(i)-32);
				else
					newString=newString+str.charAt(i);
			}
			else {
				if((str.charAt(i)>=65)&&(str.charAt(i)<=90))
					newString=newString+(char)(str.charAt(i)+32);
				else
					newString=newString+str.charAt(i);
			}
			i++;
		}
		System.out.print(newString);
}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		System.out.print("Convert to :\n1.Title Case\t2.UPPER CASE\t3.lower case\t4.Sentence case\nEnter choice : ");
		int i=0,choice=s.nextInt();
		switch (choice){
			case 1:
				toTitleCase(str);
				break;
			case 2:
				toUpperCase(str);
				break;
			case 3:
				toLowerCase(str);
				break;
			case 4:
				toSentenceCase(str);
				break;
			default:
				System.out.print("wrong choice");
				
		
		}
	}
}
