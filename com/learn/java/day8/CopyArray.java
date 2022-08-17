
public class CopyArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,5,7,8,10,14,17};
		int j=0;
		int array2[]=new int [9];
		for(int i:array)
			array2[j++]=i;
		for(j=0;j<9;j++)
			System.out.print("array["+j+"] = "+array[j]+"\t");
		
		System.out.print("\n");
		for(j=0;j<9;j++)
			System.out.print("array2["+j+"] = "+array2[j]+"\t");
	}
}
