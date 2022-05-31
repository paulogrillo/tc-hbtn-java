import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //codigo, produtos que é uma lista de Produto, cliente do tipo Cliente
    private int codigo;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(){}
    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = new ArrayList<Produto>(produtos);
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    @Override
    public String toString() {
        //[<codigo>] <nome cliente>
        return String.format("["+ "%d" +"]"+ " %s",getCodigo(), getCliente().getNome());
    }
}
