import java.util.*;

public class questao11{

	private static Scanner in = new Scanner (System.in);

	/*
       		funcao responsavel por preencher fila
        	de acordo com a quantidade de dados que o usuario deseja.
        */
        public static CFila preencherFila( ){
           CFila F = new CFila ( );
           int dado;
           for (int i = 0; i < 10; i++){
               System.out.println ("Digite o valor desejado: ");
               dado = in.nextInt( );
     	       F.enfileira(dado);
     	   }
           return F;
        }

	/*
        	metodo responsavel por imprimir fila.
        */
        public static void imprimir(CFila F, int quantidade){
            CFila Faux = F;
            for (int i = 1; i <= quantidade; i++){
               System.out.println ("["+Faux.desenfileira( )+"]");
            }
        }

	public static void furaFila(CFila F, Object item){
		F.furaFila(item);
	}//end furaFila ( )

	public static void questao11( ){
		CFila F    = new CFila( );
		CFila Faux = new CFila( );
		int q1, q2, dado;		
		Object item;
		
		System.out.println("Digite o dado que deseja inserir: ");
		dado = in.nextInt();
	
		F = preencherFila( );
		furaFila(F, dado);
		Faux = F;
		System.out.println("");
		imprimir(Faux, Faux.quantidade( ));
	}//end questao11( )

	public static void main (String [ ] args){
		questao11( );
	}//end main ( )
}//end class
