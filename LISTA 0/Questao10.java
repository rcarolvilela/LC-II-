//dependencias 

import java.io.*;
import java.util.*;

public class Questao10 {

	public static Scanner in = new Scanner (System.in);
	
	public static int [ ] inverter ( int [ ] vetor ){
		//definir dados
		int [ ] vet = new int [10];
		int i = 0;
		//repetir para inverter as posicoes 
		for ( int j = vetor.length-1; j >= 0; j-- ){
			vet[i] = vetor[j];
			//variar posicao inversa
			i++;
		}//end for  
	    return (vet);
	}//end inverter ( )	

	public static void mostrar ( int [ ] vet ){
		//repetir para mostrar 
		for ( int i = 0; i < vet.length; i++ ){
			System.out.println ( "VET POS '"+i+"': "+vet[i] );
		}//end for  
	}//end mostrar ( )
	
	public static void inverso ( ){
		//definir dados 
		int [ ] vetor = new int [10];
		int [ ] resp  = new int [10];
		int ler = 0, j = 0;
		//repetir para ler do teclado 
		while ( j < 10 ){	
			//ler do teclado
			System.out.println ( "DIGITE UM VALOR INTEIRO: " );
			ler = in.nextInt   ( );
			//guardar dado no vetor
			vetor[j] = ler;
			//variar posicao do vetor
			j++;
		}//end while 
		//mostrar vetor lido do teclado 
		System.out.println ( "" );
		System.out.println ( "VETOR LIDO DO TECLADO: " );
		mostrar (vetor);
		//mostrar o vetor invertido
		System.out.println ( "" );
		System.out.println ( "VETOR INVERTIDO: " );	
		resp = inverter (vetor);
		mostrar (resp);
	}//end inverso ( )

	public static void main ( String [ ] args ){
		inverso ( );
	}//end main ( )
}//end class
