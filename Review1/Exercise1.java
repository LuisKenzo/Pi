
import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double begin, end;

		do{
			System.out.print("Type the lower limit: ");
			begin = scan.nextDouble();
			System.out.print("Type the upper limit: ");
			end = scan.nextDouble();
				if(begin>end){
					System.out.println("ERROR");
				}
				else{
					ValidateInteger(begin, end, scan);
				}
		}while(begin>end);
	}


	public static void ValidateInteger(double begin, double end, Scanner scan){//the void type do not return a value, it just execute the algorithm inside it
		double value;
		System.out.print("Type a number: ");
		value = scan.nextDouble();
			if(value>=begin && value<=end){
				System.out.print("The number is inside the interval");
			}
			else{
				System.out.print("The number is not on the interval");
			}
	}
}