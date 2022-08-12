import java.util.Scanner;

public class MBBSorBE {

	public static void main(String[] args) {
		System.out.print("Cutoff for MBBS and Engg respectively(out of 100)\t: ");
		float mbbs,engg;
		Scanner scan=new Scanner(System.in);
		mbbs=scan.nextFloat();
		engg=scan.nextFloat();
		System.out.print("Enter marks\t:");
		float mark=scan.nextFloat();
		if((mark>=mbbs)&&(mark>=engg)) 
			System.out.println("Eligible for both");
		else if(mark>=engg)
			System.out.println("Eligible for BE");
		else
			System.out.println("Ineligible for both");
			
	}

}
