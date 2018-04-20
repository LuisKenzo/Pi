import java.util.Scanner;
import java.util.Arrays;

public class Exercise2{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("What is the vector's range? ");
		int range =  scan.nextInt();
		double vector1[] = new double [range];
		System.out.println("Fill the vector: ");
			for (int i=0;i<range ;i++ ) {
				vector1[i]=scan.nextDouble();
			}
		int position = position_greatest(vector1);
		System.out.print("The position of the greatest number in the vector is: "+position);
	}

	public static int position_greatest (double vector[]){
		int pos=0;
			for (int x=0;x<vector.length ;x++ ) {
				if(vector[x]>=vector[pos]){
					pos=x;
				}
			}
		return pos;
	}
}