package br.com.treinaweb.semana3;

public interface IDinheiro {
    //Reglas de la interfaz
    double saldo();
    double obterTaxa();
    void depositar(double valor);
    void sacar(double valor);

    //Constantes
    double taxaDeposito = 0.10; //10%
    double taxaSaque = 0.05;//5%
}