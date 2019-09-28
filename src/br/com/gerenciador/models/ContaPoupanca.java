package br.com.gerenciador.models;

import br.com.gerenciador.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    public double limite = 100;

    public ContaPoupanca() {
        super();
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
        }else if (valor > saldo && valor <= saldo +limite){
                saldo =0;
                limite -= (valor - saldo);
                System.out.println("Valor sacado com sucesso!");
        } else System.out.println("Valor solicitado maior que o permitido");
    }

    @Override
    public void depositar(double valor) {
            saldo += valor;
            System.out.println("Valor depositado com sucesso!");

    }
}
