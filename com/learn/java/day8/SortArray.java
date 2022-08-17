import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		System.out.print("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int index=0,position;
		System.out.print("enter "+size+" elements: ");
		long array[]=new long [size];
		long swapElement,temp;
		while(index<size)
		{	array[index++]=s.nextLong();
		}
		System.out.print("Sort Options :\n1.Ascending order\t2. Descending order\nEnter choice : ");
		int choice=s.nextInt();
		switch (choice) {
			case 1:	
				for(int iterations=0;iterations<size;iterations++) {
					swapElement=array[iterations];
					position=iterations;
					for(index=iterations;index<size;index++)
					{	if(swapElement>array[index]) {
							swapElement=array[index];
							position=index;
						}
					}
					if(position!=iterations) {
						array[position]=array[iterations];
						array[iterations]=swapElement;
					}
				}
				break;
			case 2:
				for(int iterations=0;iterations<size;iterations++) {
					swapElement=array[iterations];
					position=iterations;
					for(index=iterations;index<size;index++)
					{	if(swapElement<array[index]) {
							swapElement=array[index];
							position=index;
						}
					}if(position!=iterations) {
						array[position]=array[iterations];
						array[iterations]=swapElement;
					}
				}
				break;
			default:	System.out.print("Wrong choice.Try again");
						break ;
			}
		
	index=0;
	while(index<size)
	{	System.out.print(array[index++]+" ");
	}
	}
}