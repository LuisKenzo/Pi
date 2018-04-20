
package exercicio5;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double [][] matrixA = new double [4][4];
        double [][] matrixB = new double [4][4];
        double [][] matrixC = new double [4][4];
        double test=0;
        //fill matrix
        System.out.println("Matrix A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixA[i][j]=scan.nextDouble();                
            }
        }
        System.out.println("Matrix B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrixB[i][j]=scan.nextDouble();                
            }
        }
        //multiplication
for(int i = 0; i<4;i++){
    for (int j = 0; j < 4; j++) {
    for(int k=0;k<4;k++){
        test= (matrixA[i][j]*matrixB[j][k])+test;
}
    }
}
    }   
}


}
