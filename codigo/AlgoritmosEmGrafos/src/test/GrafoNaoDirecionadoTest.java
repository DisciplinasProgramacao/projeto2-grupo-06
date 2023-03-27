package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import business.GrafoNaoDirecionado;

class GrafoNaoDirecionadoTest {

	@Test
	void testCriarGrafoNaoDirecionado() {
		GrafoNaoDirecionado grafo = new GrafoNaoDirecionado("teste");
		grafo.addVertice(1);
		grafo.addVertice(2);
		grafo.addVertice(3);
		grafo.addVertice(4);
		
		assertTrue(grafo.addAresta(1, 2, 0));
		assertFalse(grafo.addAresta(2,1,0));    
		assertNull(grafo.existeAresta(1,2));
		assertNull(grafo.existeAresta(2,1));
	
	}

}
