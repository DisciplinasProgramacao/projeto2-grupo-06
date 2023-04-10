package test;
import business.Grafo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrafoTest {

	@Test
	    public void testSalvarGrafo() {
		Grafo grafo = new Grafo("teste.txt");
		grafo.addVertice(1);
        	grafo.addVertice(2);
        	grafo.addVertice(3);
        	grafo.addAresta(1, 2, 0);
	    	grafo.salvar("teste.txt");
	    
	    }
	
	 @Test
	    public void testBfs() {
	        // Grafo de entrada
	        Grafo grafoEntrada = new GrafoNaoDirecionado("grafoEntrada");
	        grafoEntrada.addVertice(1);
	        grafoEntrada.addVertice(2);
	        grafoEntrada.addVertice(3);
	        grafoEntrada.addVertice(4);
	        grafoEntrada.addVertice(5);
	        grafoEntrada.addAresta(1, 2, 1);
	        grafoEntrada.addAresta(1, 3, 1);
	        grafoEntrada.addAresta(2, 4, 1);
	        grafoEntrada.addAresta(3, 4, 1);
	        grafoEntrada.addAresta(4, 5, 1);

	        // Grafo de saída esperado
	        Grafo grafoSaidaEsperado = new GrafoNaoDirecionado("grafoSaidaEsperado");
	        grafoSaidaEsperado.addVertice(1);
	        grafoSaidaEsperado.addVertice(2);
	        grafoSaidaEsperado.addVertice(3);
	        grafoSaidaEsperado.addVertice(4);
	        grafoSaidaEsperado.addVertice(5);
	        grafoSaidaEsperado.addAresta(1, 2, 1);
	        grafoSaidaEsperado.addAresta(1, 3, 1);
	        grafoSaidaEsperado.addAresta(2, 4, 1);
	        grafoSaidaEsperado.addAresta(3, 4, 1);
	        grafoSaidaEsperado.addAresta(4, 5, 1);

	        // Executa o método bfs com o grafo de entrada
	        Grafo grafoSaida = grafoEntrada.bfs(1);

	        // Verifica se o grafo de saída é igual ao grafo esperado
	        assertEquals(grafoSaidaEsperado, grafoSaida);
	    }

}
