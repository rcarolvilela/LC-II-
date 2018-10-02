import java.io.*;
import java.util.*;

public class Lista02{

        private static Scanner        in = new Scanner (System.in);
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        public static int soma (CLista L){
            CLista L2      = L;
            Object item    = null;
            int soma       = 0;
            int dado       = 0;
            int quantidade = L.quantidade( );

            while(quantidade > 0){
                dado = (int) L2.removeRetornaComeco( );
                soma = soma + dado;
                quantidade --;
            }//end while        
          return soma;    
        }//end soma

        public static CLista preencher ( ){
            CLista L = new CLista ( );
            int dado = 0;

            for (int i = 0; i < 10; i++){
                System.out.println("Entre com um dado: ");
                dado = in.nextInt( );
                L.insereComeco(dado);
            }//end for
          return L;
        }//end preencher ( )

        public static CFila preencherF ( ){
            CFila F  = new CFila ( );
            int dado = 0;

            for (int i = 0; i < 10; i++){
                System.out.println("Entre com um dado: ");
                dado = in.nextInt( );
                F.enfileira(dado);
            }//end for
          return F;
        }//end preencher ( )

        public static int soma (CFila F){
            CFila F2       = F;
            Object item    = null;
            int dado       = 0;
            int soma       = 0;
            int quantidade = F.quantidade( );

            while(quantidade > 0){
                item = F.desenfileira( );
                dado = (int) item;
                soma = soma + (int) dado;
                quantidade--;
            }//end for
          return soma;
        }//end soma ( )

        public static CPilha preencherP ( ){
            CPilha P = new CPilha ( );
            int dado = 0;

            for (int i = 0; i < 10; i++){
                System.out.println("Entre com um dado: ");
                dado = in.nextInt( );
                P.empilha(dado);
            }//end for
          return P;
        }//end preencherP( )

        public static int somarTudo (CLista L, CFila F, CPilha P){
            CLista Laux   = L;
            CFila  Faux   = F;
            CPilha Paux   = P;
            int somarTudo = 0;
            int        q1 = L.quantidade( );
            int        q2 = F.quantidade( );
            int        q3 = P.quantidade( );
            int   amount1 = 0;
            int   amount2 = 0;
            int   amount3 = 0;
            Object L1, F1, P1; 
            int    item1, item2, item3;
            
            //somar dados da Lista 
            while(q1 > 0){
                L1      = Laux.removeRetornaComeco( );
                item1   = (int) L1;
                amount1 = amount1 + (int) item1;
                q1 --;
            }//end while

            //somar dados da Pilha
            while(q2 > 0){
                P1      = Paux.desempilha( );
                item2   = (int) P1;
                amount2 = amount2 + (int) item2;
                q2 --;
            }//end while

            //somar dados da Fila
            while(q3 > 0){
                F1      = Faux.desenfileira( );
                item3   = (int) F1;
                amount3 = amount3 + (int) item3;
                q3 --;
            }//end while

            //somar tudo 
            somarTudo = amount1 + amount2 + amount3;
           return somarTudo;
        }//end somarTudo( )

        public static int numElementosPosF (CFila F){
            CFila Faux     = F;
            int quantidade = F.quantidade( );
            int amount     = 0;
            int    item    = 0;
            Object dado    = null;
            
            while (quantidade > 0){
                dado = Faux.desenfileira( );
                item = (int) dado;
                if(item > 0){
                    amount = amount+1;
                } //end if
                quantidade --;
            }//end while
           return amount;
        }//end numElementosPosF( )

        public static int numElementosPosP (CPilha P){
            CPilha Paux    = P;
            int quantidade = P.quantidade( );
            int amount     = 0;
            int    item    = 0;
            Object dado    = null;
            
            while (quantidade > 0){
                dado = Paux.desempilha( );
                item = (int) dado;
                if(item > 0){
                    amount = amount+1;
                } //end if
                quantidade --;
            }//end while
           return amount;
        }//end numElementosPosP( )

        public static int numElementosPosL (CLista L){
            CLista Laux    = L;
            int quantidade = L.quantidade( );
            int amount     = 0;
            int    item    = 0;
            Object dado    = null;
            
            while (quantidade > 0){
                dado = Laux.removeRetornaComeco( );
                item = (int) dado;
                if(item > 0){
                    amount = amount+1;
                } //end if
                quantidade --;
            }//end while
           return amount;
        }//end numElementosPosF( )

        public static CLista variada ( ){
            CLista L = new CLista ( );
            //dados
 
            boolean bool  = true;
            L.insereComeco(bool);
            boolean bool2 = false;
            L.insereComeco(bool2);
            char  caract1 = '-';
            L.insereComeco(caract1);
            char   caract = 'a';
            L.insereComeco(caract);
            int     dado  = 10;
            L.insereComeco(dado);
            int     value = 79;
            L.insereComeco(value);
            String  valor = "valor";
            L.insereComeco(valor);
            String  vazia = " ";
            L.insereComeco(vazia);
            double  num   = 1.85;
            L.insereComeco(num);
            double  num2  = 7.92;
            L.insereComeco(num2);

          return L;
        }//end preencher ( )

        public static void imprimeCPilha(CPilha P){
            CPilha Paux    = P;
            Object item    = null;
            int dado       = 0;
            int quantidade = P.quantidade( );
            while(quantidade > 0){
		if (quantidade > 1){
                item = Paux.desempilha( );
                dado = (int) item;
                System.out.print(""+dado+"|");
		} else {
		System.out.print(""+dado);
		}//end else
                quantidade --;
            }//end while
        }//end imprimeCPilha( ) 

        public static void imprimeCFila(CFila F){
            CFila Faux     = F;
            Object item    = null;
            int dado       = 0;
            int quantidade = F.quantidade( );
            while(quantidade > 0){
		if (quantidade > 1){
                item = Faux.desenfileira( );
                dado = (int) item;
                System.out.print(""+dado+"|");
		} else {
		System.out.print(""+dado);
		}//end else
                quantidade --;
            }//end while
        }//end imprimeCFila( )

        public static void imprimeCLista(CLista L){
            CLista Laux    = L;
            Object item    = null;
            int dado       = 0;
            int quantidade =  L.quantidade( );
            while(quantidade > 0){
		if(quantidade > 1){
                item = Laux.removeRetornaComeco( );
                dado = (int) item;
                System.out.print(""+dado+"|");
		}else{
		System.out.print(""+dado);
		}
                quantidade --;
            }//end while
        }//end imprimeCLista( )

        public static CLista criaCLista (int opcao, int n){
            int dado = 0;
            CLista L = new CLista( );
            Random gerador = new Random( );

                if(opcao == 0){
                    for (int i = 0; i < n; i++){
                        L.insereComeco(i);
                    }//end for
                } else if (opcao == 1){
                    for (int i = n-1; i >= 0; i--){
                        L.insereComeco(i);
                    }//end for
                } else if (opcao == 2){
                    for (int i = 0; i < n; i++){
                        dado = gerador.nextInt(100);
                        dado = Math.abs(dado);
                        L.insereComeco(dado);
                    }//end for
                } else {
                    System.out.println("ERRO: OPCAO INVALIDA.");
                } //end else
            return L;
        }//end criaCLista( )

        public static CPilha criaPilha (int opcao, int n){
            int dado = 0;
            CPilha P = new CPilha( );
            Random gerador = new Random( );

                if (opcao == 0){
                    for (int i = 0; i < n; i++){
                        P.empilha(i);
                    }//end for
                } else if (opcao == 1){
                    for (int i = n-1; i >= 0; i--){
                        P.empilha(i);
                    }//end for
                } else if (opcao == 2){
                    for (int i = 0; i < n; i++){
                        dado = gerador.nextInt(100);
                        dado = Math.abs(dado);
                        P.empilha(dado);
                    }//end for
                } else {
                    System.out.println("ERRO: OPCAO INVALIDA.");
                }//end else
            return P;
        }//end criaPilha( )

        public static CFila criaFila (int opcao, int n){
            int dado = 0;
            CFila F  = new CFila( );
            Random gerador = new Random( );

                if (opcao == 0){
                    for (int i = 0; i < n; i++){
                        F.enfileira(i);
                    }//end for
                } else if (opcao == 1){
                    for (int i = n-1; i >= 0; i--){
                            F.enfileira(i);
                    }//end for
                } else if (opcao == 2){
                    for (int i = 0; i < n; i++){
                        dado = gerador.nextInt(100);
                        dado = Math.abs(dado);
                        F.enfileira(dado);
                    }//end for
                } else {
                    System.out.println("ERRO: OPCAO INVALIDA.");
                }//end else
            return F;
        }//end criaFila( )
        
        public static int numOcorrenciasF (CFila F, int n){
            CFila Faux      = F;
            Object dado     = null;
            int item        = 0;
            int ocorrencias = 0;
            int quantidade  = F.quantidade( );

            while (quantidade > 0){
                dado = Faux.desenfileira( );
                item = (int) dado;
                if(item == n){
                    ocorrencias++;
                }// end if 
                quantidade--;
            }//end while
            return ocorrencias;
        }//end numOcorrenciasF ( ) 

        public static int numOcorrenciasP (CPilha P, int n){
            CPilha Paux     = P;
            Object dado     = null;
            int item        = 0;
            int ocorrencias = 0;
            int quantidade  = P.quantidade( );
        
            while (quantidade > 0){
                dado = Paux.desempilha( );
                item = (int) dado;
                if (item == n){
                    ocorrencias++;
                }//end if 
                quantidade--;
            }//end while
            return ocorrencias;
        }//end numOcorrenciasP ( )

        public static int numOcorrenciasL (CLista L, int n){
            CLista Laux     = L;
            Object dado     = null;
            int item        = 0;
            int ocorrencias = 0;
            int quantidade  = L.quantidade( );

            while (quantidade > 0){
                dado = Laux.removeRetornaComeco( );
                item = (int) dado;
                if(item == n){
                    ocorrencias++;
                }//end if 
                quantidade--;
            }//end while
            return ocorrencias;
        }//end numOcorrenciasL ( )

        public static void questao01 ( ){
            CLista L = new CLista( );
            int soma = 0;

            L    = preencher( );
            soma = soma(L);

            System.out.println("SOMA: "+soma);
        }//end questao01( )

        public static void questao02 ( ){
            CFila F  = new CFila( );
            int soma = 0;

            F    = preencherF( );
            soma = soma(F);

            System.out.println("SOMA: "+soma); 
        }//end questao02( )


        public static void questao03( ){
            CLista L       = new CLista( );
            int quantidade = 0;
            Object item    = null;
            int dado       = 0;
            int soma       = 0;

            L = variada( );
            quantidade = L.quantidade( );

            while(quantidade > 0){
                item = L.removeRetornaComeco( );
                dado = (int) item;
                soma = soma + dado;
                quantidade --;
            }//end while 
            System.out.println("Soma: "+soma);
	/*
            Este e' o erro: 
            Exception in thread "main" java.lang.ClassCastException:
            java.base/java.lang.Double cannot be cast to java.base/java.lang.Integer
        */
        }//end questao03( )

        public static void questao06 ( ){
            CFila  F = new CFila ( );
            CPilha P = new CPilha( );
            CLista L = new CLista( );
            int soma = 0;

            System.out.println("LISTA: ");
            L = preencher  ( );
            System.out.println("");
            System.out.println("FILA: ");
            F = preencherF ( );
            System.out.println("");
            System.out.println("PILHA: ");
            P = preencherP ( );

            soma = somarTudo(L,F,P);
            System.out.println("SOMA DE TODOS OS TERMOS: "+soma);
        }//end questao06( )

        public static void questao07( ){
            int dado = 0;

            System.out.println("DIGITE A OPCAO DESEJADA: ");
            System.out.println("1 - CFila");
            System.out.println("2 - CLista");
            System.out.println("3 - CPilha");

            dado = in.nextInt( );

            if(dado == 1){
                System.out.println("");
                System.out.println("CFILA: ");
                CFila F = new CFila( );
                int num = 0;

                F   = preencherF( );
                num = numElementosPosF(F);
                System.out.println("Qtde de numeros positivos nesta Fila: "+num);
            } else if (dado == 2){
                System.out.println("");
                System.out.println("CLISTA: ");
                CLista L = new CLista( );
                int num  = 0; 

                L   = preencher( );
                num = numElementosPosL(L);
                System.out.println("Qtde de numeros positivos nesta Lista: "+num);  
            } else if (dado == 3){
                System.out.println("");
                System.out.println("CPILHA: ");
                CPilha P = new CPilha( );
                int num  = 0;

                P   = preencherP( );
                num = numElementosPosP(P);
                System.out.println("Qtde de numeros positivos nesta Pilha: "+num);  
            } else {
                System.out.println("ERRO: OPCAO INVALIDA.");
            }//end else
        }//end questao07( )

        public static void questao08 ( ){
            CFila  F  = new CFila  ( );
            CLista L  = new CLista ( );
            CPilha P  = new CPilha ( );
            int ocorrenciasF = 0;
            int ocorrenciasP = 0;
            int ocorrenciasL = 0;

            System.out.println("FILA:");
            F = preencherF ( );
            System.out.println("LISTA:");
            L = preencher  ( );
            System.out.println("PILHA:");
            P = preencherP ( );

            //contar o numero de ocorrencias 
            ocorrenciasF = numOcorrenciasF (F,5);
            ocorrenciasL = numOcorrenciasL (L,4);
            ocorrenciasP = numOcorrenciasP (P,0);

            System.out.println ("Ocorrencias P: " +ocorrenciasP+ " |Ocorrencias F: " +ocorrenciasF+
                                " |Ocorrencias L: "+ocorrenciasL);
        }


        public static void questao09( ){
            CFila  F = new CFila ( );
            CLista L = new CLista( );
            CPilha P = new CPilha( );
            int opcao      = 0;
            int quantidade = 0;
            int opcao2     = 0;

            System.out.println("Digite a opcao desejada: ");
            System.out.println("");
            System.out.println("0 - Gera a colecao com n elementos, de 0 ate n-1.");
            System.out.println("1 - Gera a colecao com n elementos em ordem decrescente, de n-1 ate 0.");
            System.out.println("2 - Gera a colecao com n elementos aleatorios.");
            opcao = in.nextInt( );
            System.out.println("");
            System.out.println("Entre com a quantidade de dados que deseja: ");
            quantidade = in.nextInt( );
            System.out.println("");
            System.out.println("Qual e' o tipo de celula desejada: ");
            System.out.println("110 - CFila");
            System.out.println("120 - CPilha");
            System.out.println("130 - CLista");
            opcao2 = in.nextInt( );
            System.out.println("");
            
            if(opcao2 == 110){
                System.out.println("FILA:");
                F = criaFila(opcao, quantidade);
                imprimeCFila(F);
                System.out.println("");
            } else if (opcao2 == 120){
                System.out.println("PILHA:");
                P = criaPilha(opcao, quantidade);
                imprimeCPilha(P);
                System.out.println("");
            } else if (opcao2 == 130){
                System.out.println("LISTA:");
                L = criaCLista(opcao, quantidade);
                imprimeCLista(L);
                System.out.println("");
            } else {
                System.out.println("ERRO: OPCAO INVALIDA.");
            }//end else
        }//end questao09( )

        public static void questao10( ){
                System.out.println("CFILA: ");
                CFila F = new CFila( );
                F   = preencherF( );
                
                System.out.println("CLISTA: ");
                CLista L = new CLista( );
                L   = preencher( );
                
                System.out.println("CPILHA: ");
                CPilha P = new CPilha( );
                P   = preencherP( );
                
                System.out.println("FILA:");
                imprimeCFila(F);
                System.out.println("");
                System.out.println("LISTA:");
                imprimeCLista(L);
                System.out.println("");
                System.out.println("PILHA:");
                imprimeCPilha(P);
                System.out.println("");
        }//end questao10( )

        public static void main (String [ ] args){
            questao10( );
        }//end main ( )

}//end class
