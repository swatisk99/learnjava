import java.util.*;
public class Relations {

	public static void main(String[] args) {
		float a,b,c,big,small;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a=scan.nextFloat();
		b=scan.nextFloat();
		c=scan.nextFloat();
		big=a>b?a:b;
		big=big>c?big:c;
		small=a<b?a:b;
		small=small<c?small:c;
		/*	if(a>b){
				if(a>c)
				{	big=a;
					if(b>c)
						small=c;
					else small=b;
				}
				else
				{	big=c;
					small=b;	}
			}
			else {
				if(b>c)
				{	big=b;
					if(a>c)
						small=c;
					else	small=a;
				}
				else
				{	big=c;
					small=a;	}
			} 
		 */
		System.out.println("Biggest\t"+big+"\nSmallest\t"+small);
	}
}