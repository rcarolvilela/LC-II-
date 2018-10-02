//dependencias
import java.util.*;

public class Lista01{

    private static Scanner in = new Scanner (System.in);


    /*
        funcao responsavel por preencher uma pilha
        de acordo com a quantidade de dados que o usuario deseja.
     */
    public static CPilha preencher (int quantidade){
        CPilha P = new CPilha( );
        String dado = "";

        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite o dado desejado: ");
            dado = in.next( );
            P.empilha(dado);
        }
        return P;
    }

    /*
        funcao responsavel por preencher fila
        de acordo com a quantidade de dados que o usuario deseja.
    */
    public static CFila preencherFila (int quantidade){
        CFila F = new CFila ( );
        String dado = "";
        for (int i = 0; i < quantidade; i++){
            System.out.println ("Digite o nome desejado: ");
            dado = in.next( );
            F.enfileira(dado);
        }
        return F;
    }

    /*
        metodo responsavel por imprimir fila.
     */
    public static void imprimirFila (CFila F, int quantidade){
        CFila Faux = F;
        for (int i = 1; i <= quantidade; i++){
            System.out.println (""+i+"º - "+ Faux.desenfileira( ));
        }
    }

    /*
        metodo responsavel por imprimir pilha
        de acordo com a posicao de insercao.
     */
    public static void imprimir (CPilha P, int quantidade) {
        CPilha Paux = P;
        for (int i = 0; i < quantidade; i++){
            System.out.println ("["+Paux.desempilha( )+"]");
        }
    }

    public static void ShowFila (CFila F, int quantidade){
        CFila Faux = F;
        for (int i = 0; i < quantidade; i++){
            System.out.println ("["+Faux.desenfileira( )+"]");
        }
    }

    /*
        metodo responsavel por imprimir pilha ao inverso.
     */
    public static void imprimirInvertido (CPilha P, int quantidade){
        CPilha Paux = P;
        CPilha Paux1 = new CPilha ( );
        for (int i = 0; i < quantidade; i++){
            Paux1.empilha(Paux.desempilha( ));
        }

        for (int i = 0; i < quantidade; i++){
            System.out.println ( "["+Paux1.desempilha( )+"]");
        }
    }

    /*
        funcao responsavel por preencher pilha com numeros inteiros aleatorios.
     */
    public static CPilha aleatorios (int quantidade){
        CPilha P = new CPilha ( );
        Random gerador = new Random ( );
        int dado = 0;

        for (int i = 0; i < quantidade; i++){
             dado = gerador.nextInt ( );
            if (dado >= 0) {
                P.empilha(dado);
            }else{
                i--;
            }
        }
        return P;
    }

    /*
        funcao responsavel por inverter os dados presentes na pilha.
     */
    public static CPilha inverter (CPilha P, int quantidade){
        CPilha Paux = P;
        CFila F = new CFila ( );
        Object dado = new Object( );

        for (int i = 0; i < quantidade; i++){
            if(!Paux.vazia( )){
                F.enfileira(Paux.desempilha( ));
            }
        }

        for (int i = 0; i < quantidade; i++){
                dado = F.desenfileira( );
                P.empilha(dado);
        }
        return P;
    }

    /*
        metodo responsavel por limpar pilha.
     */
    public static void limpaPilha (CPilha P){
        int quantidade = P.quantidade( );

        for (int i = 0; i < quantidade; i++){
            P.desempilha( );
        }

        if (P.vazia()){
            System.out.println("");
            System.out.println("A Pilha esta' vazia.");
        }else{
            System.out.println("");
            System.out.println("Ainda ha' elementos nesta Pilha.");
        }
    }


    /*
        metodo01 - metodo para preencher e imprimir pilha com
        quantidade de dados definidos pelo usuario.
     */
    public static void questao01 ( ){
        System.out.println("Quantos dados deseja empilhar?: ");
        System.out.println("");

        int quantidade = in.nextInt( );
        CPilha P = new CPilha ( );
        P = preencher( quantidade );

        imprimir(P,quantidade);
    }

    /*
        metodo02 - meotodo responsavel por preencher uma pilha
        de acordo com a quantidade de dados definidos pelo usuario
        e imprimir em ordem inversa.
    */
    public static void questao02 ( ){
        System.out.println("Quantos dados deseja empilhar?: ");
        System.out.println("");

        int quantidade = in.nextInt( );
        CPilha P = new CPilha ( );
        P = preencher( quantidade );

        imprimirInvertido (P,quantidade);
    }

    /*
        metodo03 - metodo responsavel por preencher uma pilha
        inverter e imprimir (na ordem de entrada dos dados).
     */
    public static void questao03 ( ){
        System.out.println("Quantos dados deseja empilhar?: ");
        System.out.println("");

        int quantidade = in.nextInt( );
        CPilha P = new CPilha ( );
        P = preencher(quantidade);
        inverter(P,quantidade);
        imprimir(P,quantidade);
    }


    /*
        metodo04 - meotod responsavel por preencher e imprimir
        uma pilha com dados gerados aleatoriamente.
     */
    public static void questao04 ( ){
        System.out.println("Quantos dados deseja empilhar?: ");
        System.out.println("");

        int quantidade = in.nextInt( );
        CPilha P = new CPilha ( );
        P = aleatorios(quantidade);

        imprimir (P,quantidade);
    }

    /*
        metodo06 - metodo responsavel por preencher e imprimir
        uma fila com a quantidade de dados definida pelo usuario.
     */
    public static void questao06 ( ){

        System.out.println("Quantos dados deseja enfileirar: ");
        System.out.println("");

        CFila F = new CFila ( );
        int quantidade = in.nextInt ( );
        F = preencherFila(quantidade);
        imprimirFila(F, quantidade);
    }

    /*
        metodo07 - metodo responsavel por preencher, imprimir
        uma fila com a quantidade de dados definidas pelo usuario,
        além de limpar(esvaziar) a mesma.
     */
    public static void questao07( ){
        System.out.println("Quantos dados deseja empilhar?: ");
        System.out.println("");

        int quantidade = in.nextInt( );
        CPilha P = new CPilha ( );
        P = preencher (quantidade);
        imprimir (P, quantidade);

        limpaPilha(P);
    }

    /*
        metodo08 - metodo responsavel por preencher, imprimir
        uma pilha com a quantidade de dados definidas pelo usuario,
        além de limpar(esvaziar) a mesma através de um metodo da
        classe Pilha.
     */
    public static void questao08 ( ){
        System.out.println("Quantos dados deseja empilhar: ");
        System.out.println("");

        CPilha P = new CPilha ( );
        int quantidade = in.nextInt ( );
        P = preencher(quantidade);
        P.limpa( );
    }
    /*
        metodo09 - metodo responsavel por preencher, imprimir
        uma fila com a quantidade de dados definidas pelo usuario,
        além de limpar(esvaziar) a mesma através de um metodo da
        classe Fila.
     */
    public static void questao09 ( ){
        System.out.println("Quantos dados deseja enfileirar: ");
        System.out.println("");

        CFila F = new CFila ( );
        int quantidade = in.nextInt ( );
        F = preencherFila(quantidade);
        F.limpa( );
    }

    public static void main (String [] args){
    }//end main ( )
}//end class
