import java.util.*;
class Arithmetic{
	public static void main(String args[]){
		double value1,value2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		value1=s.nextDouble();
		value2=s.nextDouble();
		System.out.format("sum\t:%d%ndifference\t:%d%nproduct\t:%d%nquotient\t:%f%n",(value1+value2),(value1-value2),(value1*value2),(value1/value2));
		}
}