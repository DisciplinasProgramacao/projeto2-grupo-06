package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import business.GrafoMutavel;


public class GrafoMutavelTest {

    GrafoMutavel grafo;
    
    @Before
    public void setUp() throws Exception {
        grafo = new GrafoMutavel("Grafo de teste");
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addAresta(1, 2, 10);
        grafo.addAresta(2, 3, 20);
    }
    
    @Test
    public void testAddVertice() {
        assertTrue(grafo.addVertice(4));
        assertFalse(grafo.addVertice(1));
    }

    @Test
    public void testRemoveVertice() {
        assertNotNull(grafo.removeVertice(1));
        assertNull(grafo.removeVertice(4));
    }
    
    @Test
    public void testExisteVertice() {
        assertNotNull(grafo.existeVertice(1));
        assertNull(grafo.existeVertice(4));
    }
    
    @Test
    public void testAddAresta() {
        assertTrue(grafo.addAresta(1, 3, 30));
        assertFalse(grafo.addAresta(1, 4, 40));
        assertFalse(grafo.addAresta(1, 2, 50));
    }
    
    @Test
    public void testRemoveAresta() {
        assertNotNull(grafo.removeAresta(1, 2));
        assertNull(grafo.removeAresta(1, 3));
    }
    
    @Test
    public void testExisteAresta() {
        assertNull(grafo.existeAresta(1, 2));
        assertNull(grafo.existeAresta(1, 3));
    }
}
