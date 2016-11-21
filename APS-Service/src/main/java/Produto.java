import java.util.Date;
public class Produto{
  private String nome;
  private int quantidade;
  private Date validade;

  public Produto(String nome, int quantidade, Date validade){
    this.nome = nome;
    this.quantidade = quantidade;
    this.validade = validade;
  }

  public Date getValidade() {
    return validade;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public void setValidade(Date validade) {
    this.validade = validade;
  }

  @Override
  public String toString() {
    return "nome: "+this.nome+" quantidade: "+this.quantidade+" validade: "+this.validade;
  }
}
