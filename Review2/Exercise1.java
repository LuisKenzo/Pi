import java.util.Scanner;
public class Exercise1{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int position;
		do{
		System.out.print("What is the position? ");
		position = scan.nextInt();
			if (position<=0) {
				System.out.print("Error!");
			}
		}while(position<=0);
		System.out.print("The value of the fibonacci position is: "+ fibonacci(position));
	}
	public static int fibonacci(int n){
		int sum=0;
		int x=1;
		int y=1;
		if(n == 1 || n == 2){
			sum =1;
			return sum;
		} 
		else{
			for (int i=2; i<n ;i++ ) {
				sum = x+y;
				x=y;
				y=sum;
			}
			return sum;
		}
	}
}