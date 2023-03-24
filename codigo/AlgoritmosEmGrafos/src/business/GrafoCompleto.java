package business;

public class GrafoCompleto extends Grafo {

    public GrafoCompleto(String nome) {
        super(nome);
    }

    public static Grafo grafoCompleto(int ordem) {
        if (ordem < 1) {
            return null;
        }
        GrafoCompleto grafo = new GrafoCompleto("Grafo Completo de " + ordem + " vértices");
        for (int i = 1; i <= ordem; i++) {
            grafo.addVertice(i);
        }
        for (int i = 1; i <= ordem; i++) {
            for (int j = i + 1; j <= ordem; j++) {
                grafo.addAresta(i, j, 1);
            }
        }
        return grafo;
    }

    @Override
    public boolean completo() {
        int n = this.ordem();
        return this.tamanho() == (n * (n - 1)) / 2;
    }
       
}
