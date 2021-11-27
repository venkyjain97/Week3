import java.util.Scanner;
public class LowerTriangularMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matrix=new int[3][3];
		int row=matrix.length;
		int cols=matrix[0].length;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			matrix[i][j]=sc.nextInt();			
		}
	}
	if(row!=cols) {
		System.out.println("Matrix should be square matrix");
	}else {
		System.out.println("\"User input for matrix\"");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j]+" ");			
			}
			System.out.println();
		}
	}
	System.out.println("\"Lower triangular matrix\"");
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			if(j>i) {
				System.out.print("0 ");
			}else {
				System.out.print(matrix[i][j]+" ");
			}
		}
		System.out.println();
	 }
	}
   }