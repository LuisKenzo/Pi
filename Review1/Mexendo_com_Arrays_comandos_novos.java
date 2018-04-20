import java.util.Arrays;
import java.util.Scanner;
public  class Mexendo_com_Arrays_comandos_novos{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    double foo[][] = new double[2][3] ;
	    System.out.print("Insert numbers: ");
	    for (int i=0;i<foo.length ;i++ ) {//foo.length = o numero de linhas
	    	for (int a=0;a<foo[i].length ;a++ ) {//foo[i].length = o número de colunas na linha i
	    		foo[i][a]=scan.nextInt();
	    	}
	    }
	    System.out.println(foo.length);
	    System.out.println(foo[0].length); //
	    System.out.println(foo[1].length); //
		System.out.print(Arrays.deepToString(foo));//Arrays.deepToString(foo) - É um método de conversão de arrays multidimensionais em string
	    // quando der erro na visualização da matriz [[D@6cd8737, [D@22f71333]
	}
}