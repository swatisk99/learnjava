import java.util.*;
class Wrapper{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		Integer i=Integer.valueOf(in%7);
		//Integer i2=Integer.valueOf(235);
		Integer i2=new Integer(235); //is no longer possible in versions 9+
		/*It is rarely appropriate to use this constructor. 
		 * The static factory valueOf(int) is generally a better choice, 
		 * as it is likely to yield significantly better space and time performance. 
		 * Constructs a newly allocated Integer object that represents the specified int value.
		 * 
		 */
		System.out.println(i.intValue()+"  "+i2);
		
		
	}
}

		