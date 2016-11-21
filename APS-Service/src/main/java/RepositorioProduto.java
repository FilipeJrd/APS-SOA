import java.util.ArrayList;
import java.util.Date;

/**
 * Created by filipejordao on 20/11/16.
 */
public class RepositorioProduto implements  IRepositorioProduto {

    private ArrayList<Produto> produtos;
    public RepositorioProduto(){
        this.produtos = new ArrayList<Produto>();
    }
    public boolean existe(String nome){
        for (int i = 0; i < produtos.size() ; i ++){
            if(produtos.get(i).getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }

    public void cadastrar(Produto produto){
        produtos.add(produto);
    }

    public Produto buscar(String nome){
        for (int i = 0; i < produtos.size() ; i ++){
            if(produtos.get(i).getNome().equals(nome)) {
                return produtos.get(i);
            }
        }
        return null;
    }
    public boolean remover(String nome){
        for (int i = 0; i < produtos.size() ; i ++){
            if(produtos.get(i).getNome().equals(nome)){
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editar(String nome, int quantidade, Date validade) {
        Produto produto = this.buscar(nome);
        if(produto != null){
            produto.setValidade(validade);
            produto.setQuantidade(quantidade);
            this.salvar(produto);
            return true;
        }
        return false;
    }
    private void salvar(Produto produto){

        for (int i = 0; i < produtos.size() ; i ++){
            if(produtos.get(i).getNome().equals(produto.getNome())){
                produtos.set(i, produto);
            }
        }
    }
}
