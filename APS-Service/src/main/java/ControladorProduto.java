import java.util.Date;

/**
 * Created by filipejordao on 20/11/16.
 */
public class ControladorProduto {
    private CadastroProduto cadastroProduto;
    public ControladorProduto(){
        this.cadastroProduto = new CadastroProduto();
    }
    public boolean adicionarProduto(Produto produto){
        if(this.cadastroProduto.existe(produto.getNome())){
            return false;
        }else{
            this.cadastroProduto.cadastrar(produto);
            return true;
        }
    }

    public Produto consultarProduto(String nome){
        return this.cadastroProduto.buscar(nome);

    }

    public boolean removerProduto(String nome){
        if(this.cadastroProduto.existe(nome)){
            this.cadastroProduto.remover(nome);
            return true;
        }else{
            return false;
        }
    }

    public boolean editarProduto(String nome, int quantidade, Date date){
        if(this.cadastroProduto.existe(nome)){
            return this.cadastroProduto.editar(nome,quantidade,date);
        }else{
            return false;
        }
    }

}
