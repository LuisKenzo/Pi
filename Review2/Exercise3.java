import java.util.Scanner;
import java.util.Arrays;
public class Exercise3{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("What is the matrix's range? ");
		int rows = scan.nextInt();
		int columms = scan.nextInt();
		double [][] matrixA = new double [rows][columms];
		double [][] matrixB = new double [columms][rows];
		System.out.print(Arrays.deepToString(transpose_matrix(Fill(matrixA,scan), matrixB))); 
	}
	public static double [][] transpose_matrix(double [][] matrix, double [][] B){
		for (int i=0;i<B.length ;i++ ) {
			for (int j=0;j<B[i].length ;j++ ) {
				B[i][j]=matrix[j][i];
			}
		}
		return B;
	}
	public static double [][] Fill (double [][] matrix, Scanner scan ){
		System.out.print("Type the elements of the matrix to transpose: ");
		for (int i=0;i<matrix.length ;i++ ) {
			for (int j=0;j<matrix[i].length ;j++ ) {
				matrix[i][j]=scan.nextDouble();
			}
		}
		return matrix;
	}
}