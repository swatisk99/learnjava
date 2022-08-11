import java.util.*;
public class vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Name \t:");
		String name=sc.nextLine();
		System.out.print("Age\t:");
		byte age=sc.nextByte();
		System.out.print("Gender(M/F)\t:");
		String gender=sc.next();
		if(age>=18)
		{	if(gender.equals("M")||gender.equals("m"))
				System.out.print("Mr."+name+" is eligible to vote");
			else
				System.out.print("Ms."+name+" is eligible to vote");
		}
		else {
			if(gender.equals("M")||gender.equals("m"))
				System.out.print("Mr."+name+" is not eligible to vote");
			else
				System.out.print("Ms."+name+" is not eligible to vote");
		}
		System.out.print("");

	}
	

}
