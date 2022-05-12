public class Empregado {
    private String nome;
    private Endereco endereco;
    private int codigo;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
    }
    public void apresentar(){
        System.out.println("Codigo: "+ codigo);
        System.out.println("Nome: "+ nome);
        System.out.println("Bairro: "+ endereco.getBairro());
        System.out.println("Cidade: "+ endereco.getCidade());
        System.out.println("Pais: "+ endereco.getPais());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


}
