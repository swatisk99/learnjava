import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		System.out.print("Enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0,sumeven=0,sumodd=0;
		System.out.print("Enter "+size+" elements: ");
		long [] array,odd,even;
		int sizeEven=0,sizeOdd=0;
		array=new long[size];
		while(index<size)
		{	array[index]=s.nextInt();
			if(array[index++]%2==0)
				sizeEven++;
			else
				sizeOdd++;
		}
		even=new long[sizeEven];
		odd=new long[sizeOdd];
		index=0;
		int indexEven=0,indexOdd=0;
		while(index<size)
		{	if(array[index]%2==0)
				even[indexEven++]=array[index++];
			else
				odd[indexOdd++]=array[index++];
		}index=0;
		System.out.println("Array : ");
		while(index<size)
		{	System.out.print(array[index++]+" ");
		}index=0;
		System.out.println("\nis split into:\n->Array of even numbers");
		while(index<sizeEven)
		{	System.out.print(even[index++]+" ");
		}index=0;
		System.out.println("\n->Array of odd numbers");
		while(index<sizeOdd)
		{	System.out.print(odd[index++]+" ");
		}
		
	}

}
