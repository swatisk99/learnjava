import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers to be shown in Fibonacci series(atleast 1)");
		int num=sc.nextInt();
		int number1=0,number2=1,temp;
		if(num==1)
			System.out.print(number1);
		else if(num==2)
			System.out.print(number1+" "+number2);
		else if(num>2)
		{	System.out.print(number1+" "+number2);
			for(int i=3;i<=num;i++) {
				temp=number2;
				number2=number1+number2;
				number1=temp;
				System.out.print(" "+number2);
			}
		}
		else
			System.out.print("Choose an integer above 1");
	}

}
