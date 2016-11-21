import java.util.Date;

/**
 * Created by filipejordao on 20/11/16.
 */
public interface IRepositorioProduto {
    boolean existe(String nome);

    void cadastrar(Produto produto);

    Produto buscar(String nome);
    boolean remover(String nome);
    boolean editar(String nome, int quantidade, Date validade);

}
