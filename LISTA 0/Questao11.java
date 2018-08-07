//dependencias 

import java.io.*;
import java.util.*;

public class Questao11 {

	public static Scanner in = new Scanner (System.in);

	public static int [ ] swap ( int i, int j, int [ ] vetor ){
		//definir dados 
		int aux = 0; 
		//trocar posicao 
		aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
		//retornar 
	    return (vetor);
	}//end swap 

	public static int [ ] vetor ( ){
		//definir dados 
		int [ ] vetor = new int [10];
		int x = 0;
		int i = 0;
		//ler do teclado 
		while ( i < 10 ){
			System.out.println ( "VALOR PARA POS '"+i+"': " );
			//ler
			x = in.nextInt ( );
			//guardar no vetor
			vetor[i] = x;
			//variar posicao 
			i++;
		}//end while 
	    return (vetor);
	}//end 

	public static int [ ] inverter ( int [ ] vetor ){	
		//definir dados 
		int i = 0;
		int j = vetor.length-1;
		//repetir para inverter
		while ( i < j ){
			vetor = swap ( i, j, vetor );
			//alterar valores das posicoes 		
			i++;
			j--;
		}//end while
	    return (vetor); 
	}//end inverter ( )


	public static void mostrar ( int [ ] vetor ){
		//repetir para mostrar 
		for ( int i = 0; i < vetor.length; i++ ){
			System.out.println ( "VETOR POS '"+i+"': "+vetor[i] );
		}//end for
	}//end mostrar

	public static void main ( String [ ] args ) throws IOException {
		int [ ] vet = vetor ( );
		//mostrar o vetor lido do teclado
		System.out.println ( "" ); 
		System.out.println ( "VETOR LIDO DO TECLADO: " );
		System.out.println ( "" );
		mostrar ( vet );
		//inverter 
		vet = inverter ( vet );
		//mostrar invertido 
		System.out.println ( "" );
		System.out.println ( "VETOR INVERTIDO: " );
		System.out.println ( "" );
		mostrar ( vet );
	}//end main ( )
}//end class 
