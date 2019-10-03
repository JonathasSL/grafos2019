import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private String nome;
    private int grau;
    private ArrayList<Aresta> arestasConectadas = new ArrayList<Aresta>();


    public Vertice(String nome) {
        this.nome = nome;
        this.grau = 0;
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "Nome='" + nome + '\'' +
                ", Grau=" + grau +
                ", Arestas conectadas=" + arestasConectadas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getGrau() {
        return grau;
    }
}
