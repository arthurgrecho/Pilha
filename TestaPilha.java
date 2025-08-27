public class TestaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5); // Cria uma pilha de tamanho 5

        pilha.vazia();
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.insere(40);
        pilha.insere(50);
        pilha.imprime();
        pilha.cheia();
        pilha.remove();
        pilha.imprime();
        pilha.cheia();
        pilha.remove();
    }
}
