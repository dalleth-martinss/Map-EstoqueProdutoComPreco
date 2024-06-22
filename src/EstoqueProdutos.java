import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosaMap;

    public EstoqueProdutos() {
        this.estoqueProdutosaMap = new HashMap<>();
    }

    public void adicioanarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosaMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosaMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosaMap.isEmpty()){
            for(Produto p : estoqueProdutosaMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosaMap.isEmpty()){
            for(Produto p : estoqueProdutosaMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

}



