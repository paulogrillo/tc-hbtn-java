package pedido_livraria;

import pedido_livraria.produtos.Dvd;
import pedido_livraria.produtos.Livro;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Livro livro1 = new Livro("Duna", 2017, "Brasil", 56.30, 680, "Frank Herbert", 1);
        Livro livro2 = new Livro("Um de nós está mentindo", 2018, "Brasil", 34.93, 384,
                "Karen Mcmanus", 1);
        Livro livro3 = new Livro("Mindset Milionário", 2021, "Brasil", 31.70, 272,
                "José Roberto Marques", 1);

        Dvd dvd1 = new Dvd("Anjos da Noite 5 - Guerras de Sangue", 2016, "Estados Unidos", 16.90,
                "Anna Foerster",
                "Ação", 91);
        Dvd dvd2 = new Dvd("Annabelle 2 - A Criação do Mal", 2017, "Brasil", 39.90,
                "Jame Wan e Peter Safran",
                "Terror",
                109);

        // Pedido 1
        ItemPedido[] itensPedido1 = new ItemPedido[]{
                new ItemPedido(livro1, 1),
                new ItemPedido(dvd2, 1)
        };

        Pedido pedido1 = new Pedido(0, itensPedido1);

        System.out.printf("Total Pedido: %.2f\n", pedido1.calcularTotal());

        // Pedido 2
        ItemPedido[] itensPedido2 = new ItemPedido[]{
                new ItemPedido(livro1, 1),
                new ItemPedido(dvd2, 1)
        };

        Pedido pedido2 = new Pedido(10, itensPedido2);

        System.out.printf("Total Pedido: %.2f\n", pedido2.calcularTotal());

        // Pedido 3
        ItemPedido[] itensPedido3 = new ItemPedido[]{
                new ItemPedido(livro2, 1),
                new ItemPedido(livro3, 2),
                new ItemPedido(dvd1, 1)
        };

        Pedido pedido3 = new Pedido(5, itensPedido3);

        System.out.printf("Total Pedido: %.2f\n", pedido3.calcularTotal());

        // Pedido 4
        ItemPedido[] itensPedido4 = new ItemPedido[]{
                new ItemPedido(livro2, 1),
                new ItemPedido(livro2, 1),
                new ItemPedido(livro3, 2),
                new ItemPedido(dvd1, 1),
                new ItemPedido(dvd2, 2)
        };

        Pedido pedido4 = new Pedido(5, itensPedido4);

        System.out.printf("Total Pedido: %.2f\n", pedido4.calcularTotal());
    }
}
