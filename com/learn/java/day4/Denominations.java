import java.util.*;
public class Denominations {
	static void getDenominations(int rupees) {
		int denominations,balance;
		denominations=rupees/2000;
		balance=rupees%2000;
		System.out.println("2000 X "+denominations+"\t= "+(2000*denominations));
		denominations=balance/500;
		balance=balance%500;
		System.out.println("500 X "+denominations+"\t= "+(500*denominations));
		denominations=balance/100;
		balance=balance%100;
		System.out.println("100 X "+denominations+"\t= "+(100*denominations));
		denominations=balance/50;
		balance=balance%50;
		System.out.println("50 X "+denominations+"\t= "+(50*denominations));
		denominations=balance/10;
		balance=balance%10;
		System.out.println("10 X "+denominations+"\t= "+(10*denominations));
		System.out.println("1 X "+balance+"\t= "+balance+"\n-------------\nTotal\t= "+rupees);
	}
	
	public static void main(String[] args) {
		//rupees to denominations
		Scanner sc=new Scanner(System.in);
		System.out.print("Rupees\t: ");
		int rupees,denominations;
		rupees=sc.nextInt();
		getDenominations(rupees);
		
	
		//denominations to rupees
		System.out.println("\n\nEnter the denominations");
		System.out.print("2000 = ");
		denominations=sc.nextInt();
		rupees=denominations*2000;
		System.out.print("500 = ");
		denominations=sc.nextInt();
		rupees+=denominations*500;
		System.out.print("200 = ");
		denominations=sc.nextInt();
		rupees+=denominations*200;
		System.out.print("100 = ");
		denominations=sc.nextInt();
		rupees+=denominations*100;
		System.out.print("50 = ");
		denominations=sc.nextInt();
		rupees+=denominations*50;
		System.out.print("Rs. "+rupees);	
	}

}
