package lecture8;
import java.util.Scanner;
import java.util.Arrays;
public class Lecture8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double matrix [][] = new double [3][3];
        double sup[]=new double [3];
        //fill the matrix
        System.out.println("Fill the matrix ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.nextDouble();
                if (i==1){
                   sup[j]= matrix[i][j] ;
                }
            }
        }System.out.println(Arrays.toString(sup));
    }    
}
