package business;

public class Aresta {

    private int peso;
    private int destino;
    private boolean visitada;

    /**
     * Construtor para arestas com peso. A aresta é criada como não-visitada.
     * @param peso Peso da aresta
     * @param dest Vértice de destino
     */
    public Aresta(int peso, int destino){
        this.peso = peso;
        this.destino = destino;
        this.visitada = false;
    }

    /**
     * Método de acesso para o peso da aresta
     * @return Peso da aresta (int)
     */
    public int peso() {
        return this.peso;
    }
   
    /**
     * Método de acesso para o destino da aresta
     * @return Id do vértice de destino
     */
    public int destino() {
        return this.destino;
    }

    /**
     * Marca a aresta como visitada
     */
    public void visitar(){
        this.visitada = true;
    }

    /**
     * Marca a aresta como não visitada
     */
    public void limparVisita(){
        this.visitada = false;
    }

    /**
     * Indica se a aresta foi visitada (TRUE) ou não (FALSE)
     * @return TRUE/FALSE conforme a aresta foi visitada ou não.
     */
    public boolean visitada(){
        return this.visitada;
    }

    

}
