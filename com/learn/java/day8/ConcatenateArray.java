import java.util.Scanner;

public class ConcatenateArray {

	public static void main(String[] args) {
		System.out.print("enter size of 1st array");
		Scanner s=new Scanner(System.in);
		int size1=s.nextInt(),index=0;
		System.out.print("enter "+size1+" elements: ");
		long [] array1,array2,result;
		array1=new long [size1];
		while(index<size1)
		{	array1[index++]=s.nextLong();
		}
		System.out.print("enter size of 2nd array");
		int size2=s.nextInt();
		index=0;
		System.out.print("enter "+size2+" elements: ");
		array2=new long [size2];
		while(index<size2)
		{	array2[index++]=s.nextLong();
		}
		result=new long[size1+size2];
		index=0;
		while(index<size1)
		{	result[index]=array1[index++];
		}int i=0;
		while(i<size2) {
			result[index++]=array2[i++];
		}
		index=0;
		while(index<size1+size2)
		{	System.out.print(result[index++]+" ");
		}
	}

}
