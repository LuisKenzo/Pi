package exercicio2;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double matrixA [][] = new double [5][3];
        double matrixB [][] = new double [5][3];
        double matrixC [][] = new double [5][3];
        //fill the matrix
        System.out.println("Fill the matrixA ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = scan.nextDouble();
            }
        }    
        System.out.println("Fill the matrixB ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = scan.nextDouble();
            }
        } 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrixC));
    }
}
