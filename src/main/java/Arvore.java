public class Arvore {
    private No raiz;

    public void insere(Integer valor){
        insere(raiz, valor);
    }

    public void insere(No no, Integer valor){
        if( no == null){
            raiz = new No(valor);
        }else if(valor >= no.getInfo()){
            if(no.getRight() == null){
                no.setRight(new No(valor));
            }else{
                insere(no.getRight(), valor);
            }
        }else if(no.getLeft() == null){
            no.setLeft(new No(valor));
        }else{
            insere(no.getLeft(), valor);
        }
    }

    public void preOrder(){
        preOrder(raiz);
    }

    public void preOrder(No no){
        if(no != null){
            System.out.print(no.getInfo() + " ");
            preOrder(no.getLeft());
            preOrder(no.getRight());
        }
    }
}
