import java.util.Scanner;
public class AddTwoDMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] mat1=new int[3][3];
		int[][] mat2=new int[3][3];
		int[][] mat3=new int[3][3];
		int row=mat1.length;
		int cols=mat1[0].length;
		System.out.print("enter elements of matrix 1: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("displaying  matrix1 elements" );
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print( mat1[i][j]+" ");
			}
			System.out.println();
		}
				System.out.print("enter elements of matrix 2: ");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						mat2[i][j]=sc.nextInt();
					}
				}
				System.out.println("displaying  matrix2 elements" );
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print( mat2[i][j]+" ");
					}
					System.out.println();
				}
				
				if(row!=cols) {
					System.out.println("Matrix is should be rows equal to colums ");
				}else {}
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						if(row!=cols) {
							System.out.println("Matrix is should be rows equal to colums ");
							break;
						}else {
							mat3[i][j]=mat1[i][j]+mat2[i][j];
						}
					}
					if(row!=cols) {
						break;}
				}
				System.out.println("Addition of matrix " );
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print( mat3[i][j]+" ");
					}
					System.out.println();
				}
	          }
            }