
import java.util.LinkedList;

public class Empresa{

    private LinkedList<Cliente> catalogo_clientes;

    public Empresa(){
        this.catalogo_clientes = new LinkedList<>();
    }

    public void Inserir(Cliente c){
      catalogo_clientes.add(c);  
    }

    public void listar(){
        int i = 1;
        for( Cliente c : catalogo_clientes){
            System.out.println(i + ". " + c.nome);
            i++;
        }
    } 
}