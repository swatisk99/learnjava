import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers to be shown in Fibonacci series(atleast 1)");
		int num=sc.nextInt();
		int n1=0,n2=1,temp;
		if(num==1)
			System.out.print(n1);
		else if(num==2)
			System.out.print(n1+" "+n2);
		else if(num>2)
		{	System.out.print(n1+" "+n2);
			for(int i=3;i<=num;i++) {
				temp=n2;
				n2=n1+n2;
				n1=temp;
				System.out.print(" "+n2);
			}
		}
		else
			System.out.print("Choose an integer above 1");
	}

}
