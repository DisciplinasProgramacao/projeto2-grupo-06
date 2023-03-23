package business;

public class GrafoMutavel extends Grafo {


	public GrafoMutavel(String nome) {
		super(nome);
		
	}
	
	public boolean addVertice(int id){
        Vertice novo = new Vertice(id);
        return this.vertices.add(id, novo);
    }

    public Vertice removeVertice(int id){
        return null;
    }
    
    public boolean addAresta(int origem, int destino, int peso){
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        if(saida!=null && chegada !=null){
            adicionou = (saida.addAresta(destino, peso)&&chegada.addAresta(origem, peso));
        }
        return adicionou;

    }


    public Aresta removeAresta(int origem, int destino){
        return null;
    }
    
    public void carregar(String nomeArquivo){

    }

    public void salvar(String nomeArquivo){
        
    }


}
