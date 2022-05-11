import provedores.*;
public class ProcessadorPedido {

    private ProvedorFrete provedorFrete;
    private Frete frete = new Frete();

    public ProcessadorPedido() {

    }

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        double valor = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
        frete.setTipoProvedorFrete(provedorFrete.obterTipoProvedorFrete());
        frete.setValor(valor);

        pedido.setFrete(frete);
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void setProvedorFrete(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
