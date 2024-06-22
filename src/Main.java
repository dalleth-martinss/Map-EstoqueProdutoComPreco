public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicioanarProduto(1L, "Produto A", 10, 5.5);
        estoque.adicioanarProduto(2L, "Produto D", 5, 5.50);
        estoque.adicioanarProduto(3L, "Produto F", 3, 3.0);
        estoque.adicioanarProduto(4L, "Produto E", 2, 10.3);
        estoque.adicioanarProduto(5L, "Produto B", 8, 4.5);
        estoque.adicioanarProduto(6L, "Produto C", 3, 5.20);
        estoque.adicioanarProduto(7L, "Produto H", 2, 2.0);
        estoque.adicioanarProduto(8L, "Produto G", 1, 3.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$: " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());


    }
}