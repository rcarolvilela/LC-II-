//dependencias 

import java.io.*;
import java.util.*;

public class Questao12 {

	public static Scanner in = new Scanner (System.in);
	
	public static int [ ] vetor ( ){
		//definir dados 
		int [ ] vet = new int [100];
		int j = 5; 
		//repetir para preencher vetor 
		for ( int i = 0; i < vet.length; i++ ){
			vet[i] = j;
			//variar multiplo de 5
			j = j + 5;
		}//end for
	    return (vet);
	}//end tamanho ( )
	
	public static void mostrar ( int [ ] vet ){
		//repetir para mostrar vetor
		for ( int i = 0; i < vet.length; i++ ){
			System.out.println ( "VETOR POS '"+i+"': " +vet[i] );
		}//end for 
	}//end mostrar ( )

	public static void main ( String [ ] args ) throws IOException {
		int [ ] vetor = vetor ( );
		//mostrar vetor 
		mostrar (vetor);	
	}//end main ( )
}//end class
