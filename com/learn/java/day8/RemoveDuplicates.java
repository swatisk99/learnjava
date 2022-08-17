import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0;
		System.out.print("enter "+size+" elements: ");
		long array[]=new long [size];
		while(index<size)
		{	array[index++]=s.nextLong();
		}
		long result[]=new long [size];
		index=0;
		int i,duplicates=0,j=0;
		index=1;
		result[j++]=array[0];
		boolean isDuplicate=false;
		while(index<size) {
			for(i=0;i<index;i++) {
				if(result[i]==array[index]){
					duplicates++; 
					isDuplicate=true;
				}
			}if(!isDuplicate)
				result[j++]=array[index];
			index++;
			isDuplicate=false;
		}
		index=0;
		while(index<result.length-duplicates)
		{	System.out.print(result[index++]+" ");
		}
	}

}
