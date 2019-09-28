package br.com.gerenciador.models;

import br.com.gerenciador.ContaBancaria;
import sun.awt.X11.XSystemTrayPeer;

public class ContaCorrente extends ContaBancaria {
    public double taxaOperacao = 10;

    public ContaCorrente() {
        super();
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(double valor) {

        if(valor <= (saldo + taxaOperacao)){
            saldo -= (valor - taxaOperacao);
            System.out.println("Valor sacado com sucesso!");
        } else {
            System.out.println("Valor solicitado maior que o permitido");
        }
    }

    @Override
    public void depositar(double valor) {
            valor += (valor - taxaOperacao);
            System.out.println("Valor depositado com sucesso!");
    }
}
