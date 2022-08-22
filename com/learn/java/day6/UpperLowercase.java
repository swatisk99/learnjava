import java.util.Scanner;

public class UpperLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a letter");
		char character = sc.next().charAt(0);
		if ((character >= 65) && (character <= 90))
			System.out.println(character + " is Upper case");
		else if ((character >= 97) && (character <= 122))
			System.out.println(character + " is Lower case");
		else
			System.out.println(character + " is not a letter");
	}

}
