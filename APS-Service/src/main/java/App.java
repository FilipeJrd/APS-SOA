import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static spark.Spark.*;

public class App{
  public static void main(String[] args) {
      post("/consultarproduto", (req,res) ->{
          res.status(200);
          Produto prod = Fachada.shared.consutarProduto(req.body());
          if(prod != null) {
              return prod;
          }else{
              return "não encontrado";
          }
        //return prod;
      });
      post("/removerproduto", (req,res) ->{
          res.status(200);

          return Fachada.shared.removerProduto(req.body());
      });
      post("/cadastrarproduto", (req,res) ->{
          res.status(200);
          String[] parts = req.body().split("%");

          DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
          return Fachada.shared.adicionarProduto(parts[0],Integer.parseInt(parts[1]),format.parse(parts[2]));
      });
      post("/editarproduto", (req,res) ->{
          res.status(200);
          String[] parts = req.body().split("%");

          DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
          return Fachada.shared.editarProduto(parts[0],Integer.parseInt(parts[1]),format.parse(parts[2]));
      });

  }
}
