import java.util.Scanner;

public class TotalAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range from 1 to \t: ");
		int num=sc.nextInt();
		int sumeven=0,sumodd=0,even=0,odd=0;
		for(int i=1;i<=num;i++)
		{	if((i%2)==0)
			{	sumeven+=i;
				even++;
			}
			else
			{	sumodd+=i;
				odd++;
			}	
		}
		System.out.print("total of even number in the range : "+sumeven+"\navg of even numbers : "+(sumeven/even)+"\ntotal of odd numbers in the range : "+sumodd+"\navg of odd numbers in the range : "+sumodd/odd);
	}

}
