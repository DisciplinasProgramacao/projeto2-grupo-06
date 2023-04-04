package business;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/** 
 * MIT License
 *
 * Copyright(c) 2021-23 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */



/** 
 * Classe básica para um Grafo simples não direcionado.
 */
public class Grafo {
    
	public final String nome;
    protected ABB <Vertice> vertices;

    public static Grafo grafoCompleto(int ordem){
        return null;
    }

    
    /**
     * Construtor. Cria um grafo vazio com um nome escolhido pelo usuário. Em caso de nome não informado 
     * (string vazia), recebe o nome genérico "Grafo"
     */
    public Grafo(String nome){
        if(nome.length()==0) 
            this.nome = "Grafo";
        else
            this.nome = nome;
        this.vertices = new ABB<>();
    }

    
    /**
     * Retorna o nome do grafo (string), caso seja necessário em outras classes/sistemas
     * @return O nome do grafo (uma string)
     */
    public String nome(){
        return this.nome;
    }


    public void carregar(String nomeArquivo){

    }

    public void salvar(String nomeArquivo){
        try {
    	    BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
    	    for (Vertice vertices : vertices.getId()) {
    	        writer.write("V " + vertices.getId() + "\n");
    	    }
    	    for (Aresta arestas : arestas.destino() + arestas.peso()) {
    	        writer.write("E " + "Destino: " + arestas.destino() + "Peso: " + arestas.peso() + "\n");
    	    }
    	    writer.close();
    	} catch (IOException e) {
    	    System.out.println("Erro ao salvar o grafo: " + e.getMessage());
    	}
    }
    
    /**
     * Adiciona um vértice com o id especificado. Ignora a ação e retorna false se já existir
     * um vértice com este id
     * @param id O identificador do vértice a ser criado/adicionado
     * @return TRUE se houve a inclusão do vértice, FALSE se já existia vértice com este id
     */
    public boolean addVertice(int id){
        Vertice novo = new Vertice(id);
        return this.vertices.add(id, novo);
    }

    public Vertice removeVertice(int id){
        return null;
    }

    public Vertice existeVertice(int idVertice){
        return null;
    }

    /**
     * Adiciona uma aresta entre dois vértices do grafo, caso os dois vértices existam no grafo. 
     * Caso a aresta já exista, ou algum dos vértices não existir, o comando é ignorado e retorna FALSE.
     * @param origem Vértice de origem
     * @param destino Vértice de destino
     * @param peso Peso da aresta
     * @return TRUE se foi inserida, FALSE caso contrário
     */
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

    public Aresta existeAresta(int verticeA, int verticeB){
       return null;
    }
    
    
    public boolean completo(){
       return false;
    }

    public Grafo subGrafo(Lista<Integer> vertices){
        Vertice[] vetV = new Vertice[this.vertices.size()];
vetV = this.vertices.allElements(vetV);

for(int i = 0; i < vetV.length; i++) {
if(!vertices.getData.contains(vetV[i].getId())) {
this.vertices.remove(vetV[i].getId());
} else {
Aresta[] vetA = new Aresta[vetV[i].grau()];
vetA = vetV[i].getArestas().allElements(vetA);

for(int j = 0; j < vetA.length; j++) {
if(!vertices.getData.contains(vetA[j].destino())) {
this.vertices.find(vetV[i].getId()).removeAresta(vetA[j].destino());
}
}

}

}

return this;
}
    }
    
    public int tamanho(){
        return Integer.MIN_VALUE;
    }

    public int ordem(){
        return Integer.MIN_VALUE;
    }
    
    public Grafo bfs(int idVerticeInicio) {
    	return null;
    }

    public Grafo dfs(int idVerticeInicio) {
    	return null;
    }
}
