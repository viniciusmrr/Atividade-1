
package compra;

public class Produto {
    String nome;
    double preco;
    String unidadeMedida;

    public String getNome() {
        return nome;
    }

    public Produto(String nome, double preco, String unidadeMedida) {
        this.nome = nome;
        this.preco = preco;
        this.unidadeMedida = unidadeMedida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    }
