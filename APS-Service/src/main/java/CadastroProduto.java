import java.util.ArrayList;
import java.util.Date;

/**
 * Created by filipejordao on 20/11/16.
 */
public class CadastroProduto {
    private IRepositorioProduto produtos;
    //private ArrayList<Produto> produtos;
    public CadastroProduto(){
        this.produtos = new RepositorioProduto();
    }

    public boolean existe(String nome) {
        return this.produtos.existe(nome);
    }

    public void cadastrar(Produto produto){
        this.produtos.cadastrar(produto);
    }

    public Produto buscar(String nome) {
        return this.produtos.buscar(nome);
    }

    public boolean remover(String nome) {
        return this.produtos.remover(nome);
    }
    public boolean editar(String nome, int quantidade, Date validade){
        return this.produtos.editar(nome,quantidade,validade);
    }
}
