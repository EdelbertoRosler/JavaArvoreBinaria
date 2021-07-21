package arvorebinaria;

public class ArvoreTAD {
    private Nodo raiz;
    private int num;//variável para contar a quantidade de elementos

    public ArvoreTAD() {
        this.raiz = null;
        this.num = 0;
    }

    public int tamanho() {
        return this.num;
    }//quantidade de elementos

    public boolean ehVazia() {
        return this.num == 0;
    }//true se a árvore está vazia

    public int acessaMenor(){//chama o método recursivo
        return this.acessaMenorRec(this.raiz);
    }

    private int acessaMenorRec(Nodo n) {
        if(n == null || n.esq == null){
            return n.elem;//ponto de parada
        }
        return this.acessaMenorRec(n.esq);//vai indo para a esquerda recursivamente
    }//encontra o menor valor

    public int acessaMaior(){//chama o método recursivo
        return this.acessaMaiorRec(this.raiz);
    }

    private int acessaMaiorRec(Nodo n) {
        if(n == null || n.dir == null){
            return n.elem;//ponto de parada
        }
        return this.acessaMaiorRec(n.dir);//vai indo para a direita recursivamente
    }//encontra o maior valor

    public void insere(int elem) {
        if (raiz == null){
            this.raiz = new Nodo(elem);
        }
        else {
            this.insereRec(elem, raiz);
        }
        this.num += 1;

    }

    private void insereRec(int elem, Nodo n) {
        if (elem == n.elem){
            System.out.println("O elemento já está na árvore");
        }
        else if (elem < n.elem){
            if (n.esq == null){
                n.esq = new Nodo(elem);
            }
            else{
                this.insereRec(elem,n.esq);
            }
        }
        else if (elem > n.elem){
            if (n.dir == null){
                n.dir = new Nodo(elem);
            }
            else {
                this.insereRec(elem, n.dir);
            }
        }
    }//insere um elemento

    public boolean pesquisa(int elem) {
        return  this.pesquisaRec(elem, raiz);
    }

    private boolean pesquisaRec(int elem, Nodo n) {
        if(n == null){
            return  false;
        }
        if(elem == n.elem){
            return  true;
        }
        if (elem < n.elem){
            return pesquisaRec(elem, n.esq);
        }
        else {
            return  pesquisaRec(elem, n.dir);
        }
    }//pesquisa por um elemento

    public void imprimeEmOrdem() {
        this.imprimeEmOrdemRec(this.raiz);
    }

    private void imprimeEmOrdemRec(Nodo n) {
        if(n == null){
            return;
        }
        this.imprimeEmOrdemRec(n.esq);
        System.out.println(n.elem);
        this.imprimeEmOrdemRec(n.dir);
    }//imprime em ordem crescente, em linhas separadas

    public  void imprimePreOrdem(){ this.imprimePreOrdemRec(this.raiz);}

    private void imprimePreOrdemRec(Nodo n) {
        if(n == null){
            return;
        }
        System.out.println(n.elem);
        this.imprimeEmOrdemRec(n.esq);
        this.imprimeEmOrdemRec(n.dir);
    }//imprime em formato pré-ordem (raiz-esq-dir)

    public void imprimePosOrdem() {
        this.imprimePosOrdemRec(this.raiz);
    }

    private void imprimePosOrdemRec(Nodo n) {
        if(n == null){
            return;
        }
        this.imprimeEmOrdemRec(n.esq);
        this.imprimeEmOrdemRec(n.dir);
        System.out.println(n.elem);
    }//imprime em formato pós-ordem (esq-dir-raiz)

    /***************************************************************************
     * Funções já implementadas: Remove e Imprime em formato de árvore
     **************************************************************************/
    public void remove(int elem) {
        this.raiz = this.removeRec(elem, this.raiz);
        this.num -= 1;
    }//remove um elemento

    public Nodo removeRec(int elem, Nodo n) {
        if(n == null) {
            return null;
        }
        else if(elem == n.elem) {
            if(n.esq == null && n.dir == null) {
                return null;
            }
            else if(n.esq == null) {
                return n.dir;
            }
            else if(n.dir == null) {
                return n.esq;
            }
            else {
                Nodo aux = n.dir;
                while(aux.esq != null) {
                    aux = aux.esq;
                }
                n.elem = aux.elem;
                n.dir = this.removeRec(aux.elem, n.dir);
            }
        }
        else if(elem < n.elem) {
            n.esq = this.removeRec(elem, n.esq);
        }
        else {
            n.dir = this.removeRec(elem, n.dir);
        }
        return n;
    }

    public void imprimeFormatoArvore() {
        this.imprimeFormatoArvore(this.raiz, 0);
    }//imprime no formato de árvore

    private void imprimeFormatoArvore(Nodo n, int nivel) {
        if(n != null) {
            this.imprimeFormatoArvore(n.dir, nivel+1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            System.out.println(n.elem);
            this.imprimeFormatoArvore(n.esq, nivel+1);
        }
    }
}
