//dependencias 
import java.util.*;
import java.io.*;

//definir class 
public class Questao07 {
	
	public static Scanner in = new Scanner (System.in);

	public static double produto ( double a, int b ){
		//definir variavel de retorno 
		double resp = 0.0;
		//repetir para somar a quantidade necessaria 
		while ( b > 0 ){
			//somar sucessivamente 
			resp = resp + a;
			//variar b 
			b--; 
		}//end while
	    return (resp); 
	}//end produto 

	public static void soma ( double a, int b ){
		//definir variaveis 
		double somando = produto ( a, b );
		//mostrar resultado 
		System.out.println ( "" +a+ " x " +b+ " = " +somando );
		System.out.println ( "" );
	}//end soma ( )
	
	public static void main ( String [ ] args ) throws IOException {
		//definir variaveis para leitura
		double a = 0;
		int b    = 0;
		//mostrar informacoes para o usuario 
		System.out.println ( "" );
		System.out.println ( "Entre com o valor real desejado: " );	
		a = in.nextDouble  ( );
		System.out.println ( "" );
		System.out.println ( "Entre com o valor inteiro desejado: " );
		b = in.nextInt ( );
		//chamar funcao para somar
		soma ( a, b );
	}//end main ( )
}//end class
