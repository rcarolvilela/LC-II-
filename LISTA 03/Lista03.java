import java.util.*;

public class Lista03 {

    private static Scanner in = new Scanner (System.in);

    public static void ERROR ( ){
        System.out.println ("ERROR: Dado invalido.");
    }//end ERROR ( )

    public static int potenciaIterativa (int base, int exp){
        int potencia   = 1;
        int quantidade = exp;
        
        while (exp > 0){
            potencia = potencia * base;
            exp --;
        }//end while 
      return potencia;
    }//end potenciaIterativa( )

    public static int potenciaRecursiva (int base, int exp){
        int potencia = 1;
        if (exp == 0){
            potencia = potencia;
        } else if (exp == 1){
            potencia = base;
        } else { 
            potencia = base * potenciaRecursiva(base, exp-1);
        }
     return potencia;
    }//end potenciaRecursiva( )

    public static int fatorialIterativo (int n){
        int fatorial = 1;
        int positivo = 0;
        int negativo = 0;

        for (int i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }//end for
        return fatorial;
    }//end fatorialIterativo ( )

    public static int fatorialRecursivo (int n){
    
        if (n == 1 || n == 0){
            return 1;
        } else if (n > 1) {
            return n * fatorialRecursivo (n-1);
        }//end else
        return n;
    }//end fatorialRecursivo ( )
    
    public static int Fibonnaci (int n){
        int fibonnaci = 1;
        if (n == 0) 
            fibonnaci = 0;
        else if(n == 1)
           fibonnaci = 1;    
        else {
            fibonnaci = Fibonnaci(n-1) + Fibonnaci(n-2);
        }//end else
        System.out.println ("n: " +n);
        return fibonnaci;
    }//end Fibonnaci ( )

    public static void imprimeVetorRec (int [ ] array, int pos){
        System.out.println ("["+array[pos]+"]");       
        if (pos < array.length-1){
            imprimeVetorRec(array, pos+1);
        }         
    }//end imprimeVetorRec( );

    public static void imprimeVetorInvRec (int [ ] array, int pos){
        System.out.println ("["+array[pos]+"]");
        if (pos > 0){
            imprimeVetorInvRec(array, pos-1);
        }             
    }//end imprimeVetorRec( );

    public static int somaRec (int [ ] array, int pos){
        int soma = 0;
        if (pos < array.length){
            soma = soma + array[pos] + somaRec (array, pos+1);
        }//end if
      return soma;
    }//end somaRec( )

    public static int elementosNeg (int [ ] array, int pos){
        int quantidade = 0;
        if (pos < array.length){
            if (array[pos] < 0){
                quantidade++;
            }//end if
            quantidade = quantidade + elementosNeg(array, pos+1);
        }//end if
      return quantidade;
    }//end elementosNeg( )

    public static int NumOcorrencias (int [ ] array, int pos, int valor){
        int quantidade = 0;
        if (pos < array.length){
            if(array[pos] == valor){
                quantidade++;
            }//end if
            quantidade = quantidade + NumOcorrencias (array, pos+1, valor);
        }//end if
      return quantidade;
    }//end NumOcorrencias

    public static int FirstOcorrencia (int [ ] array, int pos, int valor){
        int posicao = 0;
        if (pos < array.length){
            if (array[pos] == valor){
                return posicao = pos;
            } else {
                return FirstOcorrencia (array, pos+1, valor);
            }//end else
        } else {
            return -1;
        } //end FirstOcorrencia
    }//end FirstOcorrencia ( )

    public static int MDC (int a, int b, int div){
        int mdc = 1;

        if (a != 0 && b != 0){
            if (div <= a && div <= b){
                if(a%div == 0 && b%div == 0){
                    mdc = mdc * div * MDC (a/div, b/div, div+1);
                    System.out.println(""+a+"/"+div+" -  "+b+"/"+div+" = mdc: "+mdc);
                } else {
                    mdc = mdc * MDC (a, b, div+1);
                }//end else
            }//end if
        } else {
            return 0;
        }//end else
      return mdc;
    }//end MDC ( )

    private static boolean isPalindromo (int [ ] vetor, int pos, int inicio, int fim){
        boolean palindromo = true;
        if (pos < vetor.length){
            if (vetor[inicio] == vetor[fim]){
                palindromo = palindromo && isPalindromo (vetor, pos+1, inicio+1, fim-1);
            } else {
                palindromo = false;
            }//end else
        }//end if 
      return palindromo;
    }//end Palindromo( )

    public static void Palindromo (int [ ] vetor, int pos, int inicio, int fim){
            boolean palindromo = isPalindromo (vetor, pos, inicio, fim);
        
            if(palindromo == true){
                System.out.println ("Os dados deste vetor sao palindromos.");
            } else {
                System.out.println ("Os dados deste vetor NAO sao palindormos.");
            }//end else
    }//end Palindromo( )

    public static void questao01 ( ){
        System.out.println ("Potencia Iterativa: "+(potenciaIterativa(2,3)));
        System.out.println ("Potencia Recursiva: "+(potenciaRecursiva(2,3)));
    }//end questao01 ( )

    public static void questao02 ( ){
        int i = 100;
        int  n = 100;
        while (n>0){
        System.out.println ("Fatorial iterativo de("+i+"):"+ (fatorialIterativo(i)));
        System.out.println ("Fatorial recursivo: "+ (fatorialRecursivo(i)));
        n--;
        i--;
        }
        /*
            O maior numero que pode ser representado positivamente em ambas 
            formas e' o numero 31, negativamente e'  o 33.
        */
    }//end end questao02 ( )

    public static void questao03 ( ){
        int i = 100;
        
        System.out.println ("Fibonnaci: "+Fibonnaci(100));
    }//end questao03 ( )

    public static void questao04 ( ){
        int [ ] vet = new int [5];
        int n = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        imprimeVetorRec(vet, 0);
    }//end questao04 ( )

    public static void questao05 ( ){
        int [ ] vet = new int [5];
        int n = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        imprimeVetorInvRec(vet, vet.length-1);
    }//end questao05( )

    public static void questao06 ( ){
        int [ ] vet = new int [5];
        int n = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        System.out.println("SOMA: " +somaRec(vet, 0));
    }//end questao05( )
    
    public static void questao07 ( ){
        int [ ] vet = new int [5];
        int n = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        System.out.println("Quantidade de elementos negativos: " +elementosNeg(vet, 0));
    }//end questao07( )

    public static void questao08 ( ){
        int [ ] vet = new int [5];
        int n = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        System.out.println("Numero de ocorrencias: " +NumOcorrencias(vet,0,3));
    }//end questao08( )

    public static void questao09 ( ){
        int [ ] vet = new int [5];
        int n = 0, posicao = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        posicao = FirstOcorrencia(vet,0,5);
        if (posicao < 0){
            System.out.println ("Nao ha' ocorrencias deste dado no vetor.");
        } else {
            System.out.println("Primeira ocorrencia esta' na posicao: " +posicao);
        }//end else
    }//end questao09( )

    public static void questao10 ( ){
        System.out.println ("MDC: "+MDC(0,2,2));
    }//end questao10 ( )

    public static void questao11 ( ){
        int [ ] vet = new int [5];
        int n = 0, posicao = 0;
        for (int i = 0; i < vet.length; i++){
            n = in.nextInt ( );
            vet[i] = n;
        }//for 
        Palindromo(vet, 0, 0, vet.length-1);
    }//end questao11( )

    public static void main (String [ ] args){
        questao03( );
    }//end main( )
}//end class 
