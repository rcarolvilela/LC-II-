import java.util.*;

public class questao05 {

	private static Scanner in = new Scanner (System.in);
    /*
        funcao responsavel por preencher uma pilha
        de acordo com a quantidade de dados que o usuario deseja.
     */
    	public static CPilha preencher ( ){
        CPilha P = new CPilha( );
        String dado = "";

        	for (int i = 0; i < 10; i++){
        	    System.out.println("Digite o dado desejado: ");
        	    dado = in.next( );
       		    P.empilha(dado);
        	}
          return P;
    	}	

      /*
        metodo responsavel por imprimir pilha
        de acordo com a posicao de insercao.
       */
       public static void imprimir (CPilha P) {
        	CPilha Paux = P;
		int quantidade = P.quantidade( );
       	 	for (int i = 0; i < quantidade; i++){
            		System.out.println ("["+Paux.desempilha( )+"]");
   		}
       }

	public static CPilha aleatorios ( ){
        CPilha P = new CPilha ( );
        Random gerador = new Random ( );
        int dado = 0;

        for (int i = 0; i < 10; i++){
             dado = gerador.nextInt (50);
            if (dado >= 0) {
                P.empilha(dado);
              }else{
                 i--;
              }
           }
           return P;
    	}


	public static void questao05( ){
		CPilha P     = new CPilha( );
		CPilha Paux  = new CPilha( );
		CPilha Paux2 = new CPilha( );
		int item;	
		int amount1, amount2;
		int soma     = 0;
		double media = 0.0;

		P = aleatorios( );
		amount1 = P.quantidade( );
		
		Paux = P;
		amount2 = Paux.quantidade( );

		for (int i = 0; i < amount1; i++){
			item = (int) Paux.desempilha( );		
			soma = soma + item;
			media = (double)soma/amount2;
			Paux2.empilha(item);
		}//end for
		System.out.println ("PILHA: ");
		imprimir(Paux2);
		System.out.println ("");
		System.out.println ("SOMA: "+soma+" | MEDIA: "+media);
	}//end questao05( )

	public static void main (String [ ] args){
		questao05( );
	}//end main ( )

}//end questao05 
