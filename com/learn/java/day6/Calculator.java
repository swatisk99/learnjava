import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(
				"SIMPLE CALCULATOR\nChoices:\n+ -> Add\n- -> Subtract\n* -> Multiply\n/ -> Divide\n% -> Modulo division\n");
		float val1, val2;
		char conitinueOption = 'y', op;
		while (conitinueOption == 'y') {
			System.out.print("Enter choice : ");
			op = scan.next().charAt(0);
			System.out.print("Enter 2 numbers");
			val1 = scan.nextFloat();
			val2 = scan.nextFloat();

			switch (op) {
			case '+':
				System.out.println(val1 + " " + op + " " + val2 + " = " + (val1 + val2));
				break;
			case '-':
				System.out.println(val1 + " " + op + " " + val2 + " = " + (val1 - val2));
				break;
			case '*':
				System.out.println(val1 + " " + op + " " + val2 + " = " + (val1 * val2));
				break;
			case '/':
				System.out.println(val1 + " " + op + " " + val2 + " = " + (val1 / val2));
				break;
			case '%':
				System.out.println(val1 + " " + op + " " + val2 + " = " + (val1 % val2));
				break;
			default:
				System.out.println("Invalid operation");
			}
			System.out.print("Continue?(y/n)");
			conitinueOption = scan.next().charAt(0);
		}
	}
}
