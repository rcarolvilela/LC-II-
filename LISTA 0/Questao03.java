//dependencias 

import java.io.*;
import java.util.*;

public class Questao03 {

	public static Scanner in = new Scanner (System.in);

	public static double calcA ( double base, double alt ){
		//definir dados 
		double resp = base * alt;
		//retornar 
	    return (resp);
	}//end calcA ( )

	public static double calcP ( double base, double alt ){
		//definir dados
		double x    = base + base;
		double high = alt + alt;
		double resp = high + x;
		//retornar 
	    return (resp);
	}//end calcP ( )

	public static boolean verificar ( double n, double x ){
		//definir dados
		boolean resp = true;
		//verificar
		if ( n > 0 && x > 0 ){
			resp = true;
		} else {
			resp = false;
		}//end else	 
	    return (resp);
	}//end verificar

	public static void main ( String [ ] args ) throws IOException {
		//definir dados
		double base   = 0.0;
		double alt    = 0.0;
		double somar  = 0.0;
		double area   = 0.0;
		double perim  = 0.0;
		boolean verif = true;
		//ler base e altura do teclado 
		do {
			System.out.println   ( "Digite o valor desejado para a BASE: " );
			base = in.nextDouble ( ); 
			//verificar se base e' valida 
			if ( base > 0 ){
			        System.out.println   ( "Digite o valor desejado para a ALTURA: " );
				alt  = in.nextDouble ( );
				area  = calcA ( base, alt );
					perim = calcP ( base, alt );
				System.out.println ( "AREA: " +area+ " | PERIMETRO: " +perim );
				somar = somar + area;
			} else {
				System.out.println ( "ERRO: BASES NEGATIVAS NAO SERAO ACEITAS." );
			}//end else  
		} while ( base > 0 );		
		System.out.println ( "SOMATORIO DE TODAS AS AREAS: " +somar );
	}//edn main ( )

}//end class
