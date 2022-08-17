
public class OneDArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,5,7,8,10,14,17};
		int i,big1=array[0],big2=array[0];
		for(i=0;i<9;i++)
			System.out.println("array["+i+"] = "+array[i]);
		for(int j:array)
			big1=big1<j?j:big1;
		for(int j:array)
			big2=((big2<j)&&(big1>j))?j:big2;
		System.out.print(big2+" is the second largest number.");
		System.out.println("Elements of array in reverse : ");
		for(i=array.length-1;i>=0;i--)
			System.out.print(array[i]+" ");
			
	
	}

}
