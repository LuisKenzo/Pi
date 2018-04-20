import java.util.Scanner;
import java.util.Arrays;
public class Exercise3{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("What is the matrix's range? ");
		int rangex =  scan.nextInt();
		int rangey = scan.nextInt();
		double matrixA[][] = new double [rangex][rangey];
		System.out.println("Fill the matrix: ");
	    for (int i=0;i<matrixA.length ;i++ ) {//foo.length = o numero de linhas
	    	for (int a=0;a<matrixA[i].length ;a++ ) {//foo[i].length = o número de colunas na linha i
	    		matrixA[i][a]=scan.nextDouble();
	    	}
		}
		analyse(matrixA); 
	}

	public static void analyse (double matrix[][]){
		int zeros=0;
		int store=0;
		for(int i = 0; i <matrix.length; i++){//matrix length returns the amount of lines, if you want to return the amount of columms, you may type "matrix[0].length" it will indicate how many columms do you have in the line
			zeros = 0;
			for (int cont=0; cont< matrix[i].length ;cont++ ) {
				if(matrix[i][cont]==0){
					zeros++;
				}
			}
			if(zeros==matrix[i].length){
				System.out.print("True");
				store ++;
				break;
			}
		}
		if(store==0){
			System.out.print("False");
		}
	}
}
