package br.com.gerenciador;

import br.com.gerenciador.models.ContaCorrente;
import br.com.gerenciador.models.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(100);
        cc.sacar(20);
        cc.sacar(10000);

        cp.depositar(100);
        cp.sacar(30);
        cp.sacar(130);
        cp.sacar(500);


    }
}
