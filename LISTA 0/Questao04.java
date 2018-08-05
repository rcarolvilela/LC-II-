//dependencias 
import java.util.*;
import java.io.*;

public class Questao04 {

	public static Scanner in = new Scanner (System.in);

	public static int quantidade ( int x, int y, int p ){
		//definir retorno 
		int resp = 0;
		//verificar 
		if ( x > y ){
			//repetir para contar 
			for ( int i = y; y < x; y = y+p ){
				resp = resp + 1;
			}//end for 
		} else if ( x < y ) {
			//repetir para contar 
			for ( int i = x; x < y; x = x+p ){
				resp = resp + 1;
			}//end for
		} else {
			resp = 1;
		}//end else
	    return (resp);
	}//end quantidade ( )

	public static int [ ] raios ( int x, int y, int p ){
		//chamar funcao contadora 
		int contar = quantidade ( x, y, p );
		//definir vetor 
		int [ ] raios = new int [contar];
		//repetir para preencher vetor dos raios 
		if ( x > y ){
			//posicao do vetor 
			int j = 0;
			//repetir para preencher 
			for ( int i = y; y < x; y = y+p ){
				raios [j] = y;
				j++;
			}//end for
		} else if ( y > x ){
			//posicao do vetor 
			int j = 0;
			//repetir paara preencher
			for ( int i = x; x < y; x = x+p ){
				raios[j] = x;
				j++;
			}//end for 
		} else {
			raios[0] = x;
		}//end else
	    return (raios);
	}//end raios ( )

	public static void area ( int x, int y, int p ){
		//chamar funcao 
		int [ ] raios = raios ( x, y, p );
		double area = 0.0; 
		//repetir para calcular e mostrar a area de acordo com cada raio 
		for ( int i = 0; i < raios.length; i++ ){
			area = (raios[i] * raios[i]) * 3.14;
			System.out.println ( " x = " +x+ " | y = " +y+ " | p = " +p+ " | raio = " +raios[i]+ " | area = " +area );
		}//end for 
	}//end area ( )

	public static void main ( String [ ] args ) throws IOException {
		//definir variaveis 
		int x, y, p; 
		//mostrar mensagem e ler do teclado 
		System.out.println ( "" );
		System.out.println ( "Digite o valor desejado para 'x': " );
		x = in.nextInt ( );
		System.out.println ( "" );
		System.out.println ( "Digite o valor desejado para 'y': " );
		y = in.nextInt ( );
		System.out.println ( "" );
		System.out.println ( "Digite o valor desejado para o incremento 'p': " );
		p = in.nextInt ( );
		//chamar metodo 
		area ( x, y, p );
	}//end main ( )
}//end class
