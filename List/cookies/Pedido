import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        cookies.add(cookie);
    }

    public int obterTotalCaixas(){
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor){
        int totalCaixasRemovidas = 0;
        for (PedidoCookie cookie : cookies) {
            if(cookie.getSabor().equals(sabor)){
                cookies.remove(sabor);
                totalCaixasRemovidas  = totalCaixasRemovidas + cookie.getQuantidadeCaixas();
            }
        }
        cookies.removeIf(cookie -> cookie.getSabor().equals(sabor));
        return totalCaixasRemovidas;
    }

}
