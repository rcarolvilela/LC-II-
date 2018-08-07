//dependencias 

import java.io.*;
import java.util.*;

public class Questao09 {

	public static Scanner in = new Scanner (System.in);

	public static int [ ] vet ( int [ ] vetor ){
		//definir dados 
		int [ ] resp = new int [5];
		int j = 0;
		//repetir para preencher só com as posicoes pares 
		for ( int i = 0; i < vetor.length; i = i+2 ){
			resp[j] = vetor[i];
			j++;
		}//end for
	    return (resp);
	}//end vet ( )

	public static void mostrar ( int [ ] vetor ){
		//repetir para mostrar vetor 
		for ( int i = 0; i < vetor.length; i++ ){
			System.out.println ( "VETOR POS '"+i+"': "+vetor[i] );
		}//end repetir 
	}//end mostrar ( )

	public static void vetor ( ){
		//definir dados 
		int j   = 0;
		int aux = 0;
		int [ ] vetor1 = new int [10];
		int [ ] vetor2 = new int [5];
		//ler do teclado 
		while ( j < 10 ){	
			System.out.println ( "DIGITE UM VALOR INTEIRO: " );
			aux = in.nextInt   ( );
			//preencher vetor 
			vetor1[j] = aux;
			//variar posicao 
			j++;
		}//end repetir para preencher
		//mostrar vetor de 10 posicoes
		System.out.println ( "" );
		System.out.println ( "VETOR DE 10 POSICOES: " );
		mostrar (vetor1);
		//criar vetor com posicoes pares 
		vetor2 = vet(vetor1);
		//mostrar vetor com 5 posicoes 
		System.out.println ( "" );
		System.out.println ( "VETOR DE 5 POSICOES (POSICOES PARES)" );
		mostrar (vetor2);
	}//end vetor ( )

	public static void main ( String [ ] args ) throws IOException {
		vetor ( );
	}//end main ( )
}//end class
