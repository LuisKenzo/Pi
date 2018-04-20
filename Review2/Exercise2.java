import java.util.Scanner;
import java.util.Arrays;
public class Exercise2{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		int size;
		do{
			System.out.print("What is the vector's size? ");
			size = scan.nextInt();
			if(size<=0){
				System.out.print("Error!");
			}
		}while (size<=0);
		double vectorA [] = new double [size];
		System.out.print("We have "+Negatives(Fill_vector(vectorA,scan))+" negatives numbers on this vector");
	}
	public static int Negatives (double []vector){
		int cont=0;
		for (int i=0;i<vector.length ;i++ ) {
			if (vector[i]<0) {
				cont++;
			}
		}
		return cont;
	}
	public static  double [] Fill_vector(double []vector,Scanner scan){
		System.out.print("Type the elements of the vector: ");
		for (int i =0;i<vector.length ;i++ ) {
			vector[i]=scan.nextDouble();
		}
		return vector;
	}
}