package test;
import business.Grafo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrafoTest {

	@Test
	    public void testSalvarGrafo() {
		Grafo grafo = new Grafo("teste");
		grafo.addVertice(1);
        	grafo.addVertice(2);
        	grafo.addVertice(3);
        	grafo.addAresta(1, 2, 3);
	    	grafo.salvar("teste.txt");
	    
	    }


}
