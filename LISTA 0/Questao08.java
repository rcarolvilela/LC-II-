//dependencias 
import java.util.*;
import java.io.*;

//definir classe 
public class Questao08 {

	public static Scanner in = new Scanner (System.in);

	/* Funcao responsavel por calcular o n! de qualquer numero inteiro
	*/
	public static int calc ( int i ){
		
		//definir dados 
		int resp = 1, j = i;
		//resolver o fatorial de 'i'
		while ( j > 0 ){
			//calcular
		 	resp = resp*j;
			//variar j 
			j--;
		}//end repetir
	    return (resp);  
	}//end calc ( ) 	

	/* Metodo responsavel por mostrar o n! de qualquer numero inteiro
	*/
	public static void fatorial ( int i ){
		//definir fatorial de um valor
		int fatorial = calc (i);
		//mostrar fatorial
		System.out.println ( "VALOR: " +i+ " | FATORIAL: "+fatorial );
	}//end fatorial ( )

	public static void main ( String [ ] args ) throws IOException {
		//mostrar mensagem 
		System.out.println ( "" );
		System.out.println ( "Digite o valor que se deseja o fatorial: " );
		//ler 	
		int fatorial = in.nextInt( );
		//chamar metodo fatorial
		fatorial (fatorial);
	}//end main ( )
}//end class

