import java.util.Scanner;
public class Conversions {
//cm to readable formats
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val,km,m,ft;
		System.out.print("Enter in cm\t: ");
		val=sc.nextInt();
		System.out.print(val+"cm\t: ");
		km=val/100000;
		if(km!=0)
			System.out.print(km+"km ");
		val%=100000;
		m=val/100;
		if(m!=0)
			System.out.print(m+"m ");
		val%=100;
		ft=val/30;
		if(ft!=0)
			System.out.print(ft+"ft ");
		val%=30;
		if(val!=0)
			System.out.print(val+"cm");
		
			
	}

}
