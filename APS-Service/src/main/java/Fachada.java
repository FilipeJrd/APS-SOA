/**
 * Created by filipejordao on 20/11/16.
 */
import java.awt.*;
import java.util.Date;
public class Fachada {
    private ControladorProduto controladorProduto;

    public static Fachada shared = new Fachada();

    private Fachada(){
        this.controladorProduto = new ControladorProduto();
    }

    public boolean adicionarProduto(String nome, int quantidade, Date validade){
        return this.controladorProduto.adicionarProduto(new Produto(nome,quantidade,validade));
    }
    public Produto consutarProduto(String nome){
        return this.controladorProduto.consultarProduto(nome);
    }

    public boolean removerProduto(String nome){
        return  this.controladorProduto.removerProduto(nome);
    }

    public boolean editarProduto(String nome, int quantidade, Date validade){
        return this.controladorProduto.editarProduto(nome,quantidade,validade);
    }
}
