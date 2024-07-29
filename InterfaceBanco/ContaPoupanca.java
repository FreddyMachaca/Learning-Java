package br.com.treinaweb.semana3;

public class ContaPoupanca implements IDinheiro {

    private double saldo;
    private double interes;

    public ContaPoupanca(double saldoInicial, double interesInicial) {
        this.saldo = saldoInicial;
        this.interes= interesInicial;
    }

    @Override
    public double saldo() {
        return this.saldo;
    }

    @Override
    public double obterTaxa() {
        return IDinheiro.taxaDeposito + IDinheiro.taxaSaque;
    }

    @Override
    public void depositar(double valor) {
        double valorTaxa = valor - IDinheiro.taxaDeposito;
        saldo += valor - valorTaxa;
    }

    @Override
    public void sacar(double valor) {
        double saqueComTaxa = valor + (valor*IDinheiro.taxaSaque);
        if (saldo >= saqueComTaxa) {
            saldo -= saqueComTaxa;
        }else{
            System.out.println("Saldo Insuficiente");
        }

    }

    public void interesBancario(){
        saldo += saldo * interes;
    }

}
