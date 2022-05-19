import java.util.ArrayList;

public class Agencia {
    String nome;
    ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }


    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial){
        String busca = buscarCliente(nomeCliente);
        if(busca == nomeCliente || busca != null){
            return false;
        }
        else{
            clientes.add(new Cliente(nomeCliente, valorTransacaoInicial));
            return true;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorDaTransacao){
        if(buscarCliente(nomeCliente) != null){
            int x = Integer.parseInt(buscarCliente(nomeCliente));
            clientes.get(x).adicionarTransacao(valorDaTransacao);
            return true;
        }
        return false;
    }
    public String buscarCliente(String nomeDoCliente){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getNome() == nomeDoCliente){
                String cliente = String.valueOf(i);
                return cliente;
            }
        }
        return null;
    }
}
