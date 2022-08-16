import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number\t: ");
		int num=sc.nextInt();
		int i=num,j=num,arm=0,digits=0;
		while(j>0)
		{	digits++;
			j/=10;
		}
		while(i>0)
		{	arm+=Math.pow(i%10,digits);
			i/=10;
		}
		if(arm==num)
			System.out.print(num+" is a Armstrong number");
		else
			System.out.println(num+" is not Armstrong number");
		System.out.println("\nArmstrong numbers from 100 to 999 : ");
		
		for(j=100;j<=999;j++)
		{	i=j;
			arm=0;
			while(i>0)
			{	arm+=Math.pow(i%10,3);
				i/=10;
			}
			if(arm==j)
				System.out.print(arm+"  ");
			
		}
	}

}
