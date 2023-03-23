package business;

import java.util.TreeMap;

public class ABB<T> {

    private TreeMap<Integer, T> data;

    /**
     * Construtor: árvore vazia
     */
    public ABB(){
        this.data = new TreeMap<>();
    }

    /**
     * Retorna o objeto procurado, ou null se não existir
     * @param key Chave de procura do objeto
     * @return O objeto com a chave, ou null se não existir
     */
    public T find(int key){
        return this.data.get(key);
    }

    /**
     * Inclui um novo elemento na árvore com a chave escolhida. Se já existir
     * elemento com esta chave, ignora a ação e retorna false.
     * @param key A chave para o elemento
     * @param newElement O elemento a inserir
     * @return TRUE se foi possível inserir, FALSE se já existia a chave e não foi inserido
     */
    public boolean add(int key, T newElement){
        boolean result = false;
        if(!this.data.containsKey(key)){
            this.data.put(key, newElement);
            result = true;
        }
        return result;
    }
    
    /**
     * Remove o elemento da árvore identificado pela chave. Retorna nulo caso a chave não exista na árvore.
     * @param key Chave do elemento a ser removido.
     * @return O elemento removido, ou null se ele não existir na árvore
     */
    public T remove(int key){
        return this.data.remove(key);
    }
    
    /**
     * Retorna a quantidade de elementos da árvore
     * @return Quantidade de elementos da árvore (int)
     */
    public int size(){
        return this.data.size();
    }


    /**
     * Retorna, em um vetor/array, todos os elementos da árvore. O vetor passado
     * como parâmetro deve ser criado previamente. O retorno contém os elementos da árvore.
     * @param array Vetor/array para abrigar os elementos da árvore. Deve ser previamente criado.
     * @return Outro vetor/array com os elementos da árvore.
     */
    public T[] allElements(T[] array){
        T[] allData = this.data.values().toArray(array);
        return allData;
    }
}
