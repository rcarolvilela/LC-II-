//dependências 

import java.util.*;
import java.io.*;

public class Questao02 {

	public static Scanner in = new Scanner (System.in);
	
	/* Funcao responsavel por multiplicar os valores e retornar
	um vetor com todas as multiplicacoes prontas.
	*/

	public static int [ ] mult ( int n, int x ){

		//vetor responsavel pela resposta 
		int [ ] resp = new int [10];
		//repetir para operar 
		for ( int i = 0; i < 10; i++ ){
			//guardar valores das operacoes no vetor
			resp[i] = n*x; 
			//variar o coeficiente
			x++; 
		}//end repetir
	    return (resp);
	}//end mult ( ) 
	
	/* Metodo responsavel por mostrar o resultado das multpilicacoes 
	*/
	
	public static void tabuada ( ){
		
		//definir variaveis 
		int n = 1, x = 1, k = 0; 
		int [ ] tab = new int [10];
		//repetir para chamar funcao 
		for ( int i = 0; i < 10; i++ ){
			tab = mult ( n, x );
			//repetir para mostrar a tabuada 
			for ( int j = 0; j < tab.length; j++ ){
				//definir k 
				k = j+1;
				//imprimir
				System.out.println ( "" +n+ " x " +k+ " = " +tab[j] );
			}//end repetir
				System.out.println ( "" );
			//variar o valor de n 
			n++;
		}//end for 
	}//end tabuada ( )

	public static void main ( String [ ] args ) throws IOException {
		tabuada ( );
	}//end main 
}//end class
