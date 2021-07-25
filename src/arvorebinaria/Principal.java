package arvorebinaria;
import java.util.Scanner;
/**
 * Estrutura de dados - árvores binárias
 * Baseado na aula do prof. Felipe Sampaio - IFRS
 * @author edelberto Hermann Rösler
 */

public class Principal {
    public static void main(String[] args) {
        ArvoreTAD arv = new ArvoreTAD();
        Scanner scan = new Scanner(System.in);

        int op = 0;

        while (op < 10){
            System.out.println("MENU DE OPERAÇÕES: ");
            System.out.println("1 - Insere elemento na árvore");
            System.out.println("2 - Pesquisa por um elemento na árvore");
            System.out.println("3 - Imprime elementos da árvore (em ordem)");
            System.out.println("4 - Imprime elementos da árvore (pré ordem)");
//        System.out.println("5 - Imprime elementos da árvore (pós ordem)");
            System.out.println("5 - Verifica se é vazia");
            System.out.println("6 - Acessa o menor elemento");
            System.out.println("7 - Acessa o maior elemento");
            System.out.println("8 - Remove elemento");
            System.out.println("9 - Consulta o tamanho (qnt elementos)");
            System.out.println("0 - Limpa");

            op = scan.nextInt();

            if (op == 1){
                System.out.println("Insira o Elemento: ");
                arv.insere(scan.nextInt());
            }
            else if (op == 2){
                System.out.println("Pesquisa valor: ");
                System.out.println(arv.pesquisa(scan.nextInt()));
            }
            else if (op == 3){ arv.imprimeEmOrdem();}
            else if (op == 4){ arv.imprimePreOrdem();}
//            else if (op == 5){ arv.imprimePosOrdem();}
            else if (op == 5){
                System.out.println("arvore é vazia? ");
                System.out.println(arv.ehVazia());
            }
            else if (op == 6){System.out.println(arv.acessaMenor());}
            else if (op == 7){System.out.println(arv.acessaMaior());}
            else if (op == 8){
                System.out.println("Remover elemento: ");
                arv.remove(scan.nextInt());
            }
            else if (op == 9){System.out.println(arv.tamanho());}
            else if (op == 0){arv.limpa();}

        }
    }
}


