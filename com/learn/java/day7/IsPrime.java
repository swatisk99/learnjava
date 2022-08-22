import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2,n=2;
		//System.out.print(2 + " "+3+" ");
		boolean isPrime=true;
		while(n<=100) {
			while(i<=n/2) {
				if((n%i)==0)
				{	isPrime=false;
					break;
				}
				else
				{	isPrime=true;
					i++;}
			}
			if(isPrime)
				System.out.print(n+" ");
			i=2;
			n++;
			
		}
	}
}