package compra;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private Carrinho carrinho1 = new Carrinho();

    public Compra() {
        Produto produto1 = new Produto("Arroz", 13.80, "1kg");
        Produto produto2 = new Produto("Guaraná Antarctica", 5.20, "2L");
        Produto produto3 = new Produto("Pano de chão", 4.21, "Uma unidade");
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

    }

    public void mostrarProduto() {
        for (int index = 0; index < produtos.size(); index += 1) {
            Produto produto = produtos.get(index);
            System.out.println((index + 1) + " - " + produto.getNome());
        }

    }

    public void inicializar() {
        boolean isRunning = true;
        Scanner scan = new Scanner(System.in);
        while (isRunning) {
            System.out.println("Digite o número do produto: ");
            this.mostrarProduto();
            System.out.println("Digite qualquer outro número para finalizar");

            int indexProduto = scan.nextInt();
            indexProduto--; // aqui tá subtraindo um

            if (this.produtos.size() >= indexProduto) {
                this.carrinho1.addProduto(this.produtos.get(indexProduto));
            } else {
                isRunning = false;
            }
        }
        this.carrinho1.precoTotal();
    }
}
