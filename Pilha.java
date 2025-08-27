public class Pilha {
    private int[] elementos;
    private int topo;
    private int tamanhoMaximo;

    // Construtor da pilha
    public Pilha(int tamanho) {
        tamanhoMaximo = tamanho;
        elementos = new int[tamanhoMaximo];
        topo = -1;
    }

    // Mostra se a pilha está vazia
    public void vazia() {
        if (topo == -1) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha NÃO está vazia.");
        }
    }

    // Mostra se a pilha está cheia
    public void cheia() {
        if (topo == tamanhoMaximo - 1) {
            System.out.println("A pilha está cheia.");
        } else {
            System.out.println("A pilha NÃO está cheia.");
        }
    }

    // Insere novo valor na pilha (elemento)
    public void insere(int valor) {
        if (topo == tamanhoMaximo - 1) {
            System.out.println("Não foi possível inserir. Pilha cheia.");
        } else {
            topo++;
            elementos[topo] = valor;
        }
    }

    // Remove o valor do topo (elemento)
    public void remove() {
        if (topo == -1) {
            System.out.println("Não foi possível remover. Pilha vazia.");
        } else {
            topo--;
        }
    }

    // Imprime os elementos da pilha
    public void imprime() {
        if (topo == -1) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.println("Elementos da pilha:");
            for (int i = topo; i >= 0; i--) {
                System.out.println(elementos[i]);
            }
        }
    }
}
