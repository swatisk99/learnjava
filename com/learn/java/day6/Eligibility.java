import java.util.Scanner;
public class Eligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m1,m2,m3,m4,m5,total,max;
		System.out.println("enter marks of 5 subject");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		System.out.println("Max marks : ");
		max=sc.nextInt();
		total=m1+m2+m3+m4+m5;
		if(total>=(max/2))
			System.out.println("Passed to next grade.");
		else
			System.out.println("Ineligible for next grade.");
		
	}

}
