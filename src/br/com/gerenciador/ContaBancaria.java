package br.com.gerenciador;

public abstract class ContaBancaria {

    public int numeroConta;
    public double saldo = 100;

    public abstract  void sacar(double valor);
    public abstract void depositar(double valor);


}
