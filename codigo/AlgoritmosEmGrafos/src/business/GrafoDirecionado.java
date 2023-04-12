package business;

public class GrafoDirecionado extends GrafoMutavel{

	public GrafoDirecionado(String nome) {
		super(nome);

	}
	
	// Grafo direcionado possui aresta ponderada e deve ter peso maior que 0.
	
	public boolean addAresta(int origem, int destino, int peso){
		
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        if(saida!=null && chegada !=null && peso>0){
            adicionou = (saida.addAresta(destino, peso)&&chegada.addAresta(origem, peso));
        }
        return adicionou;

    }


    public Aresta removeAresta(int origem, int destino){
    	 Vertice saida = this.existeVertice(origem);
         if (saida != null) {
             Aresta removida = saida.removeAresta(destino);
             if (removida != null) {
                 Vertice chegada = this.existeVertice(destino);
                 if (chegada != null) {
                     chegada.removeAresta(origem);
                 }
             }
             return removida;
         }
         return null;
    }
	

}
