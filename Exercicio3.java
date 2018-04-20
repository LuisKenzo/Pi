
package exercicio3;

import java.util.Scanner;
import java.util.Arrays;
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double matrixA [][] = new double [5][3];
        double matrixB [][] = new double [5][3];
        double matrixC [][] = new double [5][3];
        //fill the matrix
        System.out.println("Fill the matrixA ");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = fill(matrixA,scan)[i][j] + fill(matrixB,scan)[i][j] ;
            }
        }
        System.out.println(Arrays.deepToString(matrixC));
    }
    public static double[][] fill(double matrix[][],Scanner scan){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        } 
    return matrix; 
    }
    
}
