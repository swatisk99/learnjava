import java.util.Scanner;

public class IncrementalArray {

	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0,i;
		long value;
		boolean isBigger;
		System.out.println("enter "+size+" elements: ");
		long array[]=new long [size];
		System.out.print("array["+index+"] -> ");
		array[index++]=s.nextLong();
		while(index<size)
		{	System.out.print("array["+index+"] -> ");
			value=s.nextLong();
			isBigger=true;
			if(value<array[index-1]){
					System.out.println("Number must be greater than "+array[index-1]);
					isBigger=false;
				}
			if(isBigger)
			{	array[index++]=value;
			}
		}
		index=0;
		while(index<size)
		{	System.out.print(array[index++]+" ");
		}
	}

}
