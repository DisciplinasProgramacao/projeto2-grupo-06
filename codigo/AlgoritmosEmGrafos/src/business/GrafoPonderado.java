public class GrafoPonderado {
	private final int MAX_VERTICE = 10;
	private Vertice[] Vertices;
    
    private Aresta[][] matrixDeAdjacencia;
    private int quantidadeAtualDeVertices;
    
    public GrafoPonderado(){
        this.Vertices = new Vertice[MAX_VERTICE];
        matrixDeAdjacencia = new Aresta[MAX_VERTICE][MAX_VERTICE];
		quantidadeAtualDeVertices = 0;
    }
    
    public void addVertice(char rotulo){
		Vertices[quantidadeAtualDeVertices++] = new Vertice(rotulo);
	}

	public void addArestaNaoOrientada(int inicio, int fim, int peso){
        Vertice origem = Vertices[inicio];
        Vertice destino = Vertices[fim];
		matrixDeAdjacencia[inicio][fim] = new Aresta(origem, destino, peso);
		matrixDeAdjacencia[fim][inicio] = new Aresta(destino, origem, peso);
	}

	//	public void MostraGrafo(){
	//		for(int i=0; i<matrixDeAdjacencia.length; i++){
	//			for(int j=0; j<matrixDeAdjacencia[i].length; j++){
	//				Aresta Aresta = matrixDeAdjacencia[i][j];
	//			if(Aresta != null){
	//				System.out.println(Aresta.getOrigem() + " - " + Aresta.destino() + ": " + Aresta.peso());
	//			}
	//		}
	//	}
	//}
}
