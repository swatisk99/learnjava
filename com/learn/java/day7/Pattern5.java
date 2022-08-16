import java.util.Scanner;

/**
 * Program to print number in below pattern
 *	Sample Case 1
 *	Enter a number : 3
 *	      3
 *	   	2 3
 *	  1 2 3
 *
 */
public class Pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=s.nextInt();
		int i=0,j;
		while(i<num)
		{	j=1;
			while(j<num-i) 
			{	System.out.print("  ");
				j++;
			}
			while(j<=num)
				{	System.out.print(j+" ");
					j++;
				}
			i++;
			System.out.print("\n");
		}
	}

}
