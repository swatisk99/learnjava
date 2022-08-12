import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Principal amount\t");
		float p=scan.nextFloat();
		System.out.print("Rate of Interest\t");
		float r=scan.nextFloat();
		System.out.print("Number of days after receiving loan(From current date)\t");
		float t=scan.nextFloat();
		float si=p*r/100*t/365;
		float net=p+si;
		System.out.print("Simple interest\t: "+si+"\nNet payable amount\t: Rs"+net);
	
	}

}
