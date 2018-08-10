//dependencias 

import java.io.*;
import java.util.*;

public class Questao13{
	
	public static Scanner in = new Scanner (System.in);
	
	public static int [ ][ ] matriz ( ){
		//definir dados 
		int [ ][ ] matriz = new int [5][5];
		int valor = 0;
		//ler dados do telcado  
		for ( int i = 0; i < matriz.length; i++ ){
			for ( int j = 0; j < matriz[0].length; j++ ){
				System.out.println ( "DIGITE UM VALOR NA POS '["+i+"]["+j+"]: " );
				valor = in.nextInt ( );
				//definir dados nas posicoes
				matriz[i][j] = valor;	
			}//end for
		}//end for 
	    return (matriz);
	}//end matriz ( )

	public static void diagPrincipal ( int [ ][ ] matriz ){
		//repetir para mostrar
		for ( int i = 0; i < matriz.length; i++ ){
			for ( int j = 0; j < matriz[0].length; j++ ){
				if ( i == j ){
					System.out.println ( ""+matriz[i][j]);
				}//end if
				System.out.print ( "\t" );
			}//end for 
			System.out.println ( "" );
		}//end for
	}//end diagPrincpial 

	public static void main ( String [ ] args ) throws IOException {
		//ler matriz
		int [ ][ ] matriz = matriz ( );
		//mostrar diagonal principal 
		diagPrincipal (matriz);
	}//end main ( )
}//end class
