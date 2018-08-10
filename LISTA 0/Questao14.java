//dependencias 

import java.io.*;
import java.util.*;

public class Questao14 {

	public static Scanner in = new Scanner (System.in);

	public static int [ ][ ] matriz ( ){
		//definir dados 
		int [ ][ ] matriz = new int [5][5];
		int valor = 0;
		//ler dados do teclado 
		for ( int i = 0; i < 5; i++ ){
			for ( int j = 0; j < 5; j++ ){
				System.out.println ( "DIGITE UM DADO NA POS ["+i+"]["+j+"]: " );
				valor = in.nextInt ( );
				matriz[i][j] = valor;		
			}//end for
		}//end for
	    return (matriz);
	}//end matriz 
	
	public static int somar ( int [ ][ ] matriz ){
		//definir dados
		int soma = 0;
		//repetir para somar 
		for ( int i = 0; i < matriz.length; i++ ){
			for ( int j = 0; j < matriz[0].length; j++ ){
				//verificar se esta' acima da diagonal principal 
				if ( j > i ){
					soma = soma + matriz[i][j];
				}//end if 
			}//end for 
		}//end for
	    return (soma);
	}//end somar ( )
	
	public static void m ( ){
		int [ ][ ] matriz = matriz ( );
		//somar 
		int somar = somar (matriz);
		//mostrar 
		System.out.println ( "SOMATARIO ACIMA DA DIAGONAL PRINCIPAL: " +somar );
	}//end matriz ( )

	public static void main ( String [ ] args ) throws IOException {
		m ( );
	}//end main ( )
}//end class
