package br.com.treinaweb.semana3;

public class Main {
    public static void main(String[] args) {
        //maria
        IDinheiro mariaPoupanca = new ContaPoupanca(3000.0, 0.05);
        IDinheiro mariaCorrente = new ContaCorrente(2000.0);

        //Poupanca
        System.out.println("Saldo Cuenta: "+mariaPoupanca.saldo());
        mariaPoupanca.depositar(1302.3);
        mariaPoupanca.sacar(123.5);
        //mariaPoupanca.interesBancario();
        System.out.println("Saldo Cuenta despues de operaciones: "+mariaPoupanca.saldo());
        
        ContaPoupanca mariaPoupanca2 = (ContaPoupanca) mariaPoupanca;
        mariaPoupanca2.interesBancario();
        System.out.println("Saldo Cuenta: "+mariaPoupanca.saldo());
        
        
        System.out.println("\n\n");
        //Corrente
        System.out.println("Saldo Cuenta: "+mariaCorrente.saldo());
        mariaCorrente.depositar(1250.0);
        mariaCorrente.sacar(341.5);
        System.out.println("Saldo Cuenta despues de operaciones: "+mariaCorrente.saldo());
    }
}
