package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import business.GrafoDirecionado;

class GrafoDirecionadoTest {

	@Test
	void testCriarGrafoDirecionado() {
		GrafoDirecionado grafo = new GrafoDirecionado("teste");
		grafo.addVertice(1);
		grafo.addVertice(2);
		grafo.addVertice(3);
		grafo.addVertice(4);
		
		assertTrue(grafo.addAresta(1, 2, 0));
		assertFalse(grafo.addAresta(2,1,0));    //Ja existe aresta de 1 para 2, entao ele nao adiciona outra aresta de 2 para 1
		assertNull(grafo.existeAresta(1,2));
		assertNull(grafo.existeAresta(2,1));

}
}
