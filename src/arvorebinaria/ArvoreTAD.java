package arvorebinaria;

public class ArvoreTAD {
    private Nodo raiz;

    public ArvoreTAD() {
        this.raiz = null;
    }

    public int tamanho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean ehVazia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int acessaMenor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int acessaMaior() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insere(int elem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void insereRec(int elem, Nodo n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean pesquisa(int elem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private boolean pesquisaRec(int elem, Nodo n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imprimeEmOrdem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void imprimeEmOrdemRec(Nodo n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imprimePreOrdem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void imprimePreOrdemRec(Nodo n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imprimePosOrdem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void imprimePosOrdemRec(Nodo n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /***************************************************************************
     * Funções já implementadas: Remove e Imprime em formato de árvore
     **************************************************************************/
    public void remove(int elem) {
        this.raiz = this.removeRec(elem, this.raiz);
    }

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
    }

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
