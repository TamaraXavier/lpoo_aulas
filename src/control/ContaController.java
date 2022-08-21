package control;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {

    public static void main(String[] args) {

        //a
        ContaPoupança cp2 = new ContaPoupança(3000.00);
        ContaPoupança cp3 = new ContaPoupança(200.00);
        ContaPoupança cp1 = new ContaPoupança();
        System.out.println("\nConta Poupança: ");
        System.out.println(cp1 + "" + cp2 + "" + cp3);

        ContaCorrente cc1 = new ContaCorrente(200, 100, 100);
        ContaCorrente cc2 = new ContaCorrente(560, 400, 200);
        ContaCorrente cc3 = new ContaCorrente(500, 600, 600);
        System.out.print("\nContas Corrente: ");
        System.out.print(cc1 + "" + cc2 + "" + cc3);

        Associado as1 = new Associado("Maria", 400, 300, 400);
        Associado as2 = new Associado("Ana", 200, 600, 500);
        Associado as3 = new Associado("Anderson", 500,600, 700);
        System.out.print("\nAssociados: ");
        System.out.print(as1 + "" + as2 + "" + as3);

        //b
        System.out.print("\n\nContas criadas: ");
        List<Conta> Contas = new ArrayList<>();
        Contas.add(cc1);
        Contas.add(cc2);
        Contas.add(cc3);
        Contas.add(cp1);
        Contas.add(cp2);
        Contas.add(cp3);

        System.out.print("\n\nAssociados VIP criados: ");
        List<AssociadoVip> associados = new ArrayList<>();
        associados.add(as1);
        associados.add(as2);
        associados.add(as3);
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);

        List<Associado> Associados = new ArrayList<>();
        Associados.add(as1);
        Associados.add(as2);
        Associados.add(as3);
        System.out.println("\nLista de Associados: " + Associados);

        //c
        cp1.deposita(1000.00);
        cp1.saca(50.00);
        cp1.atualiza(0.05);
        System.out.println(cp1);

        cp2.deposita(500.00);
        cp2.saca(50.00);
        cp2.atualiza(0.05);
        System.out.println(cp2);

        cp3.deposita(200.00);
        cp3.saca(50.00);
        cp3.atualiza(0.05);
        System.out.println(cp3);

        //d:
        cc1.deposita(500.00);
        cc1.saca(400.00);
        cc1.atualiza(0.05);
        System.out.println(cc1);

        cc2.deposita(3000.00);
        cc2.saca(100.00);
        cc2.atualiza(0.05);
        System.out.println(cc2);

        //e/f

        associados.sort(Comparator.comparing(AssociadoVip::getQdeCotas).reversed());
        System.out.print("\n Lista de Associados Vip por quantidade de cotas (decrescente): " + associados);

        System.out.print("\n Associado com maior quantidade de cotas: ");
        AssociadoVip bigqc = Collections.max(associados, Comparator.comparing(AssociadoVip::getQdeCotas));
        associados.forEach(f -> {
            if (f.getQdeCotas() >= bigqc.getQdeCotas()) {
                System.out.print(f);
            }
        });

        associados.sort(Comparator.comparing(AssociadoVip::getQdeCotas).reversed());
        System.out.println(associados);

        //g:
        Contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(Contas);
        for (AssociadoVip associado : associados) {
            if (associado instanceof ContaCorrente){
                System.out.println(associado);
            }
        }

        System.out.println("\nContas com maior saldo:");
        Conta c_maior_saldo_bancario = Collections.max(Contas, Comparator.comparing(Conta::getSaldo));
        Contas.forEach(c ->{
            if (c.getSaldo() >= c_maior_saldo_bancario()){
                System.out.println(c);
            }
        });
    }

    private static double c_maior_saldo_bancario() {
        return 0;
    }
}
