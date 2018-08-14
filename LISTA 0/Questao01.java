//dependencias
import java.io.*;
import java.util.*;

public class Questao01 {

	public static Scanner in = new Scanner (System.in);

	public static void read ( String dado ){
		//mostrar para o usuario o dado a ser lido 
		System.out.println ( "" );
		System.out.println ( "Digite o(a) "+dado+" do usuario: " );
	}//end read ( )

	public static void usuarios ( int quantidade ){
		//dados tipo string
		String name  = "";
		String gen   = ""; 
		String nameM = "";
		String nameF = "";
		//dados inteiros
		int contF = 0;
		int contM = 0;
		int  ageF = 0;
		int  ageM = 0;
		int   age = 0;
		int  qtd  = quantidade;
		//dados reais 
		double pct    = 0.0;
		double altura = 0.0;
		double peso   = 0.0;
		double imc    = 0.0;
		double sum    = 0.0;
		double media  = 0.0;
	
		//repetir enquanto tiver candidatos 
		while ( quantidade > 0 ){
			//ler dados do teclado 
			read("nome");
			name = in.next ( );

			read("genero");
			System.out.println ( "DIGITE [F/M]:" );	
			gen = in.next ( );

			read("idade");
			age = in.nextInt ( );

			read("altura");
			altura = in.nextDouble ( );
	
			read("peso");
			peso = in.nextDouble ( );

			//verificar dados 
			if (gen.equals("f") || gen.equals("F")){
				//contar a quantidade de mulheres
				contF++;
			} else if (gen.equals("m") || gen.equals("M")){
				//contar a quantidade de homens 
				contM++;
			} else {
				System.out.println ( "ERROR: GENERO INVALIDO." );
			}//end else

	
			//calcular o imc 
			imc = (peso/Math.pow(altura,(int)2));
			//mostrar para o usuario o imc 
			System.out.printf ( "IMC = %.2f %n", imc );

			//calcular a porcentagem 
			if ( imc < 20.0 ){
				if ( gen.equals("f") || gen.equals("F")){
					//calcular porcentagem feminina 
					pct = ( 100.0 * contF )/100.0;
				}//end if 
			}//end if 
			

			if ( gen.equals("m") || gen.equals("M")){
				//descobrir o homem mais velho 
				if ( age > ageM ){
					//definir o homem mais velho
					ageM  = age;
					nameM = name;
				}//end if
 
			}//end if 

			if ( gen.equals ("f") || gen.equals ("F")){
					//descobrir mulher mais velha
					if ( age > ageF ){
						//definir a mulher mais velha 
						ageF  = age;
						nameF = name;
					}//end if 
			}//end else if 
			

			//calcular idade media 
			if ( gen.equals("m") || gen.equals("M") || gen.equals("F") || gen.equals ("f")){
				//somar as idades 
				sum = sum + age;
				//idade media 
				media = sum/qtd;
			}//end if  
			//variar quantidade de candidatos nao entrevistados
			quantidade --;
		}//end while 

		//mostrar dados finais 
		System.out.println ( "\na) Idade media: " +media );
		System.out.println ( "b) Quantidade de homens intrevistados:" +contM );
		System.out.println ( "   Quantidade de mulheres intrevistadas: " +contF );
		System.out.println ( "c) Percentual de mulheres com peso ideal: " + (int) pct + "%" );
		System.out.println ( "d) Mulher mais velha: " +nameF+ " | idade: " +ageF );
		System.out.println ( "   Homem mais velho : " +nameM+ " | idade: " +ageM );
	}//end usuarios 

	public static void main ( String [ ] args ) throws IOException {
		//ler quantidade de entrevistados do teclado 
		int quantidade = 0;
		//ler
		System.out.println ( "QUANTAS PESSOAS SERAO INTREVISTADAS? " );
		quantidade = in.nextInt ( );
		//chamar metodos 
		usuarios ( quantidade );
	}//end main ( )
}//end class
