import java.util.Scanner;

public class ArraySums {

	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int i=0,sumeven=0,sumodd=0;
		System.out.print("enter "+size+" elements: ");
		int a[]=new int [size];
		while(i<size)
		{	a[i]=s.nextInt();
			if(i%2==0)
				sumodd+=a[i++];
			else
				sumeven+=a[i++];
		}
		System.out.print("Sum of elements in odd position : "+sumodd+"\nSum of elements in even position : "+sumeven);
	}

}
