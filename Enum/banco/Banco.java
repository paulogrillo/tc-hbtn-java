import java.util.ArrayList;

public class Banco {
    String nome;
    ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public String buscarAgencia(String nomeAgencia){
        for(int i = 0; i< agencias.size(); i++){
            if(agencias.get(i).getNome() == nomeAgencia){
                String agencia = String.valueOf(i);
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia){
        String busca = buscarAgencia(nomeAgencia);
        if(busca != null || busca == nomeAgencia){
            return false;
        }
        this.agencias.add(new Agencia(nomeAgencia));
        return true;
    }

    public boolean  adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial){
        String busca = buscarAgencia(nomeAgencia);
        if(busca != null || busca == nomeCliente){
            int i = Integer.parseInt(busca);
            if (agencias.get(i).getNome() == nomeAgencia) {
                if (agencias.get(i).buscarCliente(nomeCliente) != null) {
                    return false;
                } else {
                    this.agencias.get(i).novoCliente(nomeCliente, valorInicial);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        String busca = buscarAgencia(nomeAgencia);
        if(busca != null){
            int i = Integer.parseInt(busca);
            if (agencias.get(i).getNome() == nomeAgencia) {
                agencias.get(i).adicionarTransacaoCliente(nomeCliente, valorTransacao);
                return true;
            }
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprime){
        String busca = buscarAgencia(nomeAgencia);
        int x = Integer.parseInt(busca);
        if (busca != null){
            if(imprime == true){
                for(int i = 0; i<agencias.get(x).clientes.size(); i++){
                    System.out.println("Cliente: " + agencias.get(x).clientes.get(i).getNome() + " [" + (i+1)+ "]");
                    for(int j = 0; j<agencias.get(x).clientes.get(i).transacoes.size(); j++){
                        System.out.println("  ["+(j+1)+"] valor " +agencias.get(x).clientes.get(i).transacoes.get(j));
                    }
                }
            } else{
                System.out.println("Cliente: " + agencias.get(x).getClientes() + " [" + x+ "]");
            }
            return true;
        }
        return false;
    }

}
