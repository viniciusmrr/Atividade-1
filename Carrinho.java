package compra;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrinho {

    private HashMap<Produto, Integer> produtos = new HashMap<>();

    public void addProduto(Produto produto) {
        if (this.produtos.get(produto) == null) {
            this.produtos.put(produto, 1);
        } else {
            this.produtos.put(produto, this.produtos.get(produto) + 1);
        }

    }

    public void listaProdutos() {
        for (int index = 0; index < produtos.size(); index += 1) {
            System.out.println("Produtos: = " + produtos);
        }
    }

    public void precoTotal() {
        double precoTotal = 0;
        String quantidadeProdutos = "\n";
        for (Produto produto : this.produtos.keySet()) {
            precoTotal += produto.getPreco() * this.produtos.get(produto);
            quantidadeProdutos += this.produtos.get(produto) + " x " + produto.getNome() + ".\n";
        }
        System.out.println("Preço total" + precoTotal
                + quantidadeProdutos);
    }
}
