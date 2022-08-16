import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2,n=2;
		//System.out.print(2 + " "+3+" ");
		boolean isprime=true;
		while(n<=100) {
			while(i<=n/2) {
				if((n%i)==0)
				{	isprime=false;
					break;
				}
				else
				{	isprime=true;
					i++;}
			}
			if(isprime)
				System.out.print(n+" ");
			i=2;
			n++;
			
		}
	}
}