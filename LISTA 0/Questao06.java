//dependencias 

import java.io.*;
import java.util.*;

public class Questao06 {
	
	public static Scanner in = new Scanner (System.in);

	public static void ler ( String x ){
		//ler
		System.out.println ( "Digite o valor de "+x+": " );
	}//end ler ( )

	public static double area ( double base, double altura ){
		//definir dados
		double area = 0.0;
		//calcular area 
		area = base * altura;
		//retornar 
	    return (area);
	}//end area ( ) 

	public static double perimetro ( double base, double altura ){
		//definir dados 	
		double perimetro = 0.0;
		double b = 0.0, a = 0.0;
		//definir valores
		b = base + base;
		a = altura + altura;
		//calcular perimetro 
		perimetro = a + b;
		//retornar 
	    return (perimetro);
	}//end perimetro ( )
	
	public static double tamanho ( double x, double y ){
		//definir dados
		double tamanho = 0.0;
		//calcular tamanho 
		tamanho = y - x;
		//retornar 	
	    return (tamanho);
	}//end tamanho ( )

	public static void mostrar ( double base, double altura, double area, double perimetro ){
		//mostrar
		System.out.println ( "" );
		System.out.println ( "BASE: "+base+" |ALTURA: " +altura+" |AREA: "+area+" |PERIMETRO: "+perimetro ); 
	}//end mostrar ( )

	public static void calcular ( ){
		//definir dados 	
		double area = 0.0, perimetro = 0.0, base = 0.0, altura = 0.0;
		double x1, y1, p1;	
		double x2, y2, p2;
		//ler dados da base 
		ler ("x1");
		x1 = in.nextDouble ( );
		ler ("y1");
		y1 = in.nextDouble ( );
		ler ("p1");
		p1 = in.nextDouble ( );
		//ler dados da altura
		ler ("x2");
		x2 = in.nextDouble ( );
		ler ("y2");
		y2 = in.nextDouble ( );
		ler ("p2");
		p2 = in.nextDouble ( );
		//verificar dados
		if ( x1 == 0 || y1 == 0 || x2 == 0 ||
		     y2 == 0 || x1 > y1 || x2 > y2 ){
			//mostrar erro 
			System.out.println ( "ERRO: DADOS INVALIDOS." );
			System.out.println ( "O VALOR DE 'X' DEVERÁ SER MENOR QUE O VALOR DE 'Y'" );
		} else {
			//repetir para calcular
			while ( x1 < y1 && x2 < y2 ){
				//mostrar variaveis
				System.out.println ( "" );
				System.out.println ( "X1: "+x1+" | Y1: "+y1+ " | P1: " +p1 );
				System.out.println ( "X2: "+x2+" | Y2: "+y2+ " | P2: " +p2 ); 
				//definir tamanho do intervalo 
				base = tamanho ( x1, y1 );
				altura = tamanho ( x2, y2 );
				//calcular area
				area = area ( base, altura );
				//calcular perimetro 	
				perimetro = perimetro ( base, altura );
				//mostrar dados 
				mostrar ( base, altura, area, perimetro );
				//variar valores de x
				x1 = x1 + p1;
				x2 = x2 + p2;
			}//end while
		}//end else 
	}//end calcular ( )
	
	public static void main ( String [ ] args ){
		calcular ( );
	}//end main ( )
}//end Questao06 
