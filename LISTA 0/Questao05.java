//dependencias 

import java.util.*;
import java.io.*;

public class Questao05 {

	public static Scanner in = new Scanner (System.in);

	public static double calc ( double j ){
		//definir retorno 
		double resp = (j*j) * 3.14;
		//retornar
		return (resp);
	}//end calc 

	public static void area ( ){
		//definir dados 
		int x = 1;
		int y = 10;
		double resp = 0.0;
		//repetir para calcular
		for ( double i = x; i <= y; i = i + 0.1 ){
			//chamar funcao 
			resp = calc (i);
			//mostrar operacao de cada raio 
			System.out.println ( "X = " +x+ " | Y = " +y+ " | RAIO = " +i+ " | AREA = " +resp ); 
		}//end for  
	}//end area 	

	public static void main ( String [ ] args ) throws IOException{
		area ( );
	}//end main ( )	
}//end class
