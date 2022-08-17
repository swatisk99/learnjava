import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		System.out.print("Enter size of matrices(n and m) : ");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int column=s.nextInt();
		long [][] matrix1=new long [row][column];
		boolean isEqual=true;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print("matrix1["+i+"]["+j+"] -> ");
				matrix1[i][j]=s.nextLong();
			}
		}
		System.out.println("\nMatrix1 : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.print("\n");
		}
		long [][] matrix2=new long [row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print("matrix2["+i+"]["+j+"] -> ");
				matrix2[i][j]=s.nextLong();
			}
		}
		System.out.println("\nMatrix2 : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print(matrix2[i][j]+" ");
				
			}
			System.out.print("\n");
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
					if(matrix1[i][j]!=matrix2[i][j]) {
						isEqual=false;
						break;
					}
				
			}
		}
		if(isEqual)
			System.out.println("Matrices are equal");
		else
			System.out.println("Matrices are not equal");
		long [][] sumMatrix,productMatrix;
		sumMatrix=new long [row] [column];
//		productMatrix=new long [row] [column];
//		long product;
		for(int i=0;i<row;i++){			
			for(int j=0;j<column;j++) {	
					sumMatrix[i][j]= matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print(sumMatrix[i][j]+" ");
			}System.out.print("\n");
		}
/**		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++) {	
				System.out.print(productMatrix[i][j]+" ");
			}System.out.print("\n");
		}
**/		
		long transposeMatrix[][]=new long [column][row];
		for(int i=0;i<column;i++){			
			for(int j=0;j<row;j++) {	
					transposeMatrix[i][j]= matrix1[j][i];
			}
		}
		for(int i=0;i<column;i++){
			for(int j=0;j<row;j++) {	
				System.out.print(transposeMatrix[i][j]+" ");
			}System.out.print("\n");
		}
			
	}
}
