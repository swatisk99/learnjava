import java.util.*;
public class BiggestorSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of numbers\t: ");
		int n=sc.nextInt();
		int big,small,val,i=0;
		System.out.print("Enter numbers\t: ");
		val=sc.nextInt();
		big=val;
		small=val;
		do {
			val=sc.nextInt();
			big=big>val?big:val;
			small=small<val?small:val;
			i++;
		}while(i<n);
	System.out.print("Biggest number\t: "+big+"\nSmallest number\t: "+small);
}
}