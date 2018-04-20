
package exercicio4;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vectorA[] = new double [12];
        double vectorB[] = new double [12];
        double matrixC[][] = new double[2][12];
        //fill vectors
        System.out.println("Vector A");
        for (int i = 0; i < 12; i++) {
            vectorA[i]=scan.nextDouble();            
        }
        System.out.println("Vector B");
        for (int i = 0; i < 12; i++) {
            vectorB[i]=scan.nextDouble();            
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                if(i==0){
                    matrixC[i][j]=2*(vectorA[j]);
                }
                else{
                    matrixC[i][j]=5*(vectorB[j]);
                }
            }
        }
        System.out.println("MatrixC : " + Arrays.deepToString(matrixC));
    }
    
}
