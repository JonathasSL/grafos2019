
public class Aresta {

    private boolean dirigido;
    private double peso;
    private Vertice v1,v2;

    public Aresta(boolean dirigido, double peso, Vertice v1, Vertice v2) {
        this.dirigido = dirigido;
        this.peso = peso;
        this.v1 = v1;
        this.v2 = v2;
    }

    public Aresta(boolean dirigido, Vertice v1, Vertice v2) {
        this.dirigido = dirigido;
        this.peso = -1;
        this.v1 = v1;
        this.v2 = v2;
    }


    @Override
    public String toString() {
        if (dirigido){
            return "Aresta{" +
                        ", Peso= " + peso +
                        ", vértice origem= " + v1 +
                        ", vértice destino= " + v2 +
                        '}';
        } else return "Aresta{" +
                ", peso=" + peso +
                ", vértice= " + v1 +
                ", vértice= " + v2 +
                '}';
    }

    public Vertice getV1() {
        return v1;
    }

    public Vertice getV2() {
        return v2;
    }

    public boolean isDirigido() {
        return dirigido;
    }

    public double getPeso() {
        return peso;
    }
}
