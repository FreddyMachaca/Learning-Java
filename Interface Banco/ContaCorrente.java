package br.com.treinaweb.semana3;

public class ContaCorrente implements IDinheiro{
    private double saldo;

    public ContaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }
    //CONTRATO DE INTERFACE

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
        var impuestos = valor * IDinheiro.taxaDeposito;
        saldo += valor - impuestos;
    }

    @Override
    public void sacar(double valor) {
        double saqueComTaxa = valor + (valor * IDinheiro.taxaSaque);
        if (saldo >= saqueComTaxa) {
            saldo -= saqueComTaxa;
        }else{
            System.out.println("No tienes dinero");
        }
    }


}