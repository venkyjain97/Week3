import java.util.Scanner;
public class MatrixColumnWise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] mat=new int[3][3];
		int row=mat.length;
		int cols=mat[0].length;
		System.out.print("enter elements of matrix 1: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix elements columns wise" );
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print( mat[i][j]+" ");
			}
		}
	}
}