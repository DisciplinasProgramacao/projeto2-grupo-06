package business;

import java.util.LinkedList;

/** Classe para encapsular uma lista duplamente encadeada */
public class Lista<T> {

    private LinkedList<T> data;

    /**
     * Construtor: lista vazia
     */
    public Lista() {
        this.data = new LinkedList<>();
    }

    /**
     * Adiciona um elemento no final da lista. Retorna TRUE se foi possível adicionar. 
     * @param newElement Elemento a ser adicionado.
     * @return TRUE se pôde ser adicionado, FALSE caso contrário
     */
    public boolean add(T newElement) {
        return this.data.add(newElement);
    }

    /**
     * Retorna, em um vetor/array, todos os elementos da lista. O vetor passado
     * como parâmetro deve ser criado previamente. O retorno contém os elementos da lista.
     * @param array Vetor/array para abrigar os elementos da lista. Deve ser previamente criado.
     * @return Outro vetor/array com os elementos da lista.
     */
    public T[] allElements(T[] array) {
        T[] allData = this.data.toArray(array);
        return allData;
    }

    /**
     * Remove e retorna o elemento da lista na posição indicada. Os elementos subsequentes são "deslocados para a esquerda",
     * isto é, todos têm seu índice diminuído em 1. Retorna nulo caso a posição não exista na lista.
     * @param index Chave do elemento a ser removido.
     * @return O elemento removido, ou null se ele não existir na lista
     */
    public T remove(int index){
        T retElement = null;
        if(index>=0 && index<this.data.size())
            retElement = this.data.remove(index);
        return retElement;
    }

    /**
     * Retorna o tamanho da lista.
     * @return Quantidade de elementos da lista (int)
     */
    public int size(){
        return this.data.size();
    }

}
