package business;

public class GrafoMutavel extends Grafo {
    
    public GrafoMutavel(String nome) {
        super(nome);
    }

    public boolean addVertice(int id) {
        if (existeVertice(id) == null) {
            Vertice novo = new Vertice(id);
            return this.vertices.add(id, novo);
        }
        return false;
    }

    public Vertice removeVertice(int id) {
        Vertice vertice = existeVertice(id);
        if (vertice != null) {
            for (Integer vizinho : vertice.vizinhos()) {
                Vertice v = existeVertice(vizinho);
                if (v != null) {
                    v.removeAresta(id);
                }
            }
            this.vertices.remove(id);
        }
        return vertice;
    }

    public Vertice existeVertice(int idVertice) {
        return this.vertices.find(idVertice);
    }

    public boolean addAresta(int origem, int destino, int peso) {
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        if (saida != null && chegada != null) {
            adicionou = (saida.addAresta(destino, peso) && chegada.addAresta(origem, peso));
        }
        return adicionou;
    }

    public Aresta removeAresta(int origem, int destino) {
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

    public Aresta existeAresta(int verticeA, int verticeB) {
        Vertice vA = this.existeVertice(verticeA);
        if (vA != null) {
            return vA.existeAresta(verticeB);
        }
        return null;
    }

}
