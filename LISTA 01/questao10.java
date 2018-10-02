import java.util.*;

public class questao10{

	private static Scanner in = new Scanner (System.in);

	    /*
	        funcao responsavel por preencher fila
	        de acordo com a quantidade de dados que o usuario deseja.
	    */
	    public static CFila preencherFila ( ){
	        CFila F = new CFila ( );
	        String dado = "";
	        for (int i = 0; i < 10; i++){
	            System.out.println ("Digite o nome desejado: ");
	            dado = in.next( );
	            F.enfileira(dado);
	        }
	        return F;
	    }
	

  
	public static void main (String [ ] args){
		CFila F = new CFila( );
		F = preencherFila( );
		F.furaFila(10);
		F.mostra( );
	}//end main ( )
}//end class
