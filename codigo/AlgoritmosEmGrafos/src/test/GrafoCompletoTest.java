package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import business.GrafoCompleto;
import business.Grafo;

public class GrafoCompletoTest {

    @Test
    public void testGrafoCompleto3Vertices() {
        Grafo grafoCompleto = Grafo.grafoCompleto(3);
        if (grafoCompleto != null) {
            Assertions.assertTrue(grafoCompleto.completo());
            Assertions.assertEquals(3, grafoCompleto.ordem());
        }
    }

    @Test
    public void testGrafoCompleto5Vertices() {
        Grafo grafoCompleto = Grafo.grafoCompleto(5);
        if (grafoCompleto != null) {
            Assertions.assertTrue(grafoCompleto.completo());
            Assertions.assertEquals(5, grafoCompleto.ordem());
        }
    }

    @Test
    public void testGrafoCompleto0Vertices() {
        Grafo grafoCompleto = Grafo.grafoCompleto(0);
        Assertions.assertNull(grafoCompleto);
        if (grafoCompleto != null) {
            Assertions.assertTrue(grafoCompleto.completo());
            Assertions.assertEquals(0, grafoCompleto.ordem());
        }

}
}
