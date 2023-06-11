public class App {
    public static void main(String[] args) throws Exception {
        Arvore a = new Arvore();
        a.insere(10);
        a.insere(20);
        a.insere(30);
        a.insere(5);

        a.preOrder();
    }
}
