package control;

import model.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class VendaController {

    public static void main(String[] args){
        Fornecedor f1 = new Fornecedor();
        Fornecedor f2 = new Fornecedor("12.122.122/0001-12", "1234567890", "João");

        Vendedor v1 = new Vendedor(1, "Mario", "Av. um", "Três Vendas", "96060606", "Pelotas", "RS", "45");
        Vendedor v2 = new Vendedor(2, "Anderson", "Rua Elvins", "Três Vendas", "96060605", "Pelotas", "RS", "01");

        Pedido p1 = new Pedido(1, new GregorianCalendar(2022, Calendar.FEBRUARY, 10,10,25), 200.00, v1);
        Pedido p2 = new Pedido(2, new GregorianCalendar(2022, Calendar.JANUARY, 03, 8,10), 40.00, v2);

        Produto prod1 = new Produto(1, "Liquidificador", 1, 200.00, f1);
        Produto prod2 = new Produto(2, "Descascador", 0, 40.00, f2);

        Item i1 = new Item(1, 7.00, 1, prod1);
        Item i2 = new Item(2, 7.00, 2, prod2);

        System.out.println("\n Vendas");

        prod1.getItems().add(i1);
        prod2.getItems().add(i2);
        p1.getItems().add(i1);
        p2.getItems().add(i2);
        v1.getPedidos().add(p1);
        v2.getPedidos().add(p2);

        System.out.println("\nEstoque:");

        prod1.setQuantidade(prod1.getQuantidade()-1);
        prod2.setQuantidade(prod2.getQuantidade()-1);
        //b
        System.out.println("\n Venda 1: ");
        System.out.println(v1.getPedidos());

        System.out.println("\n Venda 2: ");
        System.out.println(v2.getPedidos());

        //c
        Produto prod3 = new Produto(3, "Pizza", 1, 14.00, f1);
        Produto prod4 = new Produto(4, "Sorvete", 1, 7.00, f2);

        double total = prod3.getPreco() * 50;
        prod3.setQuantidade(prod3.getQuantidade() - 1);
        Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2022, Calendar.MARCH, 20, 8, 0), total, f1, prod3);

        total = prod4.getPreco() * 50;
        prod4.setQuantidade(prod4.getQuantidade() - 1);
        Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2022, Calendar.MARCH, 20, 8, 0), total, f1, prod4);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        System.out.print("\n Lista de fornecimentos: ");
        System.out.println(fornecimentos);

        double totalFornecido = 0.0;
        for (Fornecimento fornecimento : fornecimentos) {
            totalFornecido += fornecimento.getValorTotal();
        }
        System.out.print("\n Total fornecido: " + NumberFormat.getCurrencyInstance().format(totalFornecido));

        if (prod1.getQuantidade() < 0 || prod2.getQuantidade() < 0) {
            verifica();
        }
    }
//Objetivo 4 Classe de Exceção
    private static void verifica() {
        mythrowException();
    }

    private static void mythrowException(){
        try {
            System.out.println("Erro, estoque insuficiente.");
            throw new EstoqueInsuficienteException();
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        } finally {
            System.err.println("executado classe exceção");
        }
    }

    static class EstoqueInsuficienteException extends Exception {
        public EstoqueInsuficienteException() {
            super("Erro, estoque insuficiente.");
        }
    }

}
