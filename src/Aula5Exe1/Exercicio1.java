package Aula5Exe1;

public class Exercicio1 {
    public static void main(String[] args) {
        //cria objeto cliente
        Cliente joao = new Cliente("João", "das Couves");
        Cliente ze = new Cliente("Zé", "Mané");

        //cria objeto conta
        Conta contaJoao = new Conta(12345, 300, "João");
        Conta contaZemane = new Conta(10045,0, "Zé");

        //metodo  deposito e saque por cliente
        contaJoao.deposito(7300);
        contaJoao.saque(500);

        contaZemane.deposito(1000);
        contaZemane.saque(2000);

    }
}