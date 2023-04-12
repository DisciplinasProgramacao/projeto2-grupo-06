package business;

public class GrafoNaoDirecionado extends GrafoMutavel{

	public GrafoNaoDirecionado(String nome) {
		super(nome);
	
	}
	
	//Consideramos que um grafo direcionado nao possui aresta ponderada para diferenciar grafo direcionado e nao direcionado.
	
	public boolean addAresta(int origem, int destino){
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        if(saida!=null && chegada !=null){
            adicionou = (saida.addAresta(destino)&&chegada.addAresta(origem));
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
