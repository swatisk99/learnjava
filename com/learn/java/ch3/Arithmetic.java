import java.util.*;
class Arithmetic{
	public static void main(String args[]){
		int a,b;
		float c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=(float)a/(float)b;
		System.out.format("sum\t:%d%ndifference\t:%d%nproduct\t:%d%nquotient\t:%f%n",(a+b),(a-b),(a*b),c);
		}
}