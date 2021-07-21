package arvorebinaria;
import java.util.Scanner;
/**
 *
 * @author edelberto Rösler
 */
public class Principal {
    public static void main(String[] args) {
        ArvoreTAD arv = new ArvoreTAD();

        arv.insere(10);
        arv.insere(55);
        arv.insere(8);
        arv.insere(15);
        arv.insere(81);
        arv.insere(99);
        arv.insere(88);
//        arv.imprimeEmOrdem();
//        arv.imprimeFormatoArvore();
        arv.remove(88);
        System.out.println(arv.pesquisa(81));
        System.out.println(arv.tamanho());
        System.out.println(arv.ehVazia());
        System.out.println(arv.acessaMenor());
        System.out.println(arv.acessaMaior());
//        arv.imprimeEmOrdem();
//        arv.imprimepreOrdem();
        arv.imprimeFormatoArvore();
    }

}


