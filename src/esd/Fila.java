package esd;

public class Fila <T> {

    // aqui serão armazenados os dados em fila
    // note que outros atributos da classe Fila serão necessários para implementar a fila !
    T[] mem;

    // esta anotação é necessária para que o compilador Java aceite criar a área de armazenamento
    @SuppressWarnings("unchecked")
    public Fila(int cap) {
        // a área de armazenamento da fila precisa deste truque para ser criada
        // não é possível criar diretamente com new T[capacity], uma vez que o tipo T é desconhecido !
        mem = (T[])new Object[cap];
    }

    public int comprimento() {
    }

    public int capacidade() {
    }

    public void adiciona(T algo) {
    }

    public T remove() {
    }

    public T frente() {
    }

    public T fim() {
    }    

    public boolean estaVazia() {
    }

    public void limpa() {
    }
}
