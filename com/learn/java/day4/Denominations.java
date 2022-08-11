import java.util.*;
public class Denominations {

	public static void main(String[] args) {
		//rupees to denominations
		Scanner sc=new Scanner(System.in);
		System.out.print("Rupees\t: ");
		int rup,denom,bal;
		rup=sc.nextInt();
		denom=rup/2000;
		bal=rup%2000;
		System.out.println("2000 X "+denom+"\t= "+(2000*denom));
		denom=bal/500;
		bal=bal%500;
		System.out.println("500 X "+denom+"\t= "+(500*denom));
		denom=bal/100;
		bal=bal%100;
		System.out.println("100 X "+denom+"\t= "+(100*denom));
		denom=bal/50;
		bal=bal%50;
		System.out.println("50 X "+denom+"\t= "+(50*denom));
		denom=bal/10;
		bal=bal%10;
		System.out.println("10 X "+denom+"\t= "+(10*denom));
		System.out.println("1 X "+bal+"\t= "+bal+"\n-------------\nTotal\t= "+rup);
	
		//denominations to rupees
		System.out.println("\n\nEnter the denominations");
		System.out.print("2000 = ");
		denom=sc.nextInt();
		rup=denom*2000;
		System.out.print("500 = ");
		denom=sc.nextInt();
		rup+=denom*500;
		System.out.print("200 = ");
		denom=sc.nextInt();
		rup+=denom*200;
		System.out.print("100 = ");
		denom=sc.nextInt();
		rup+=denom*100;
		System.out.print("50 = ");
		denom=sc.nextInt();
		rup+=denom*50;
		System.out.print("Rs. "+rup);
	
	}

}
