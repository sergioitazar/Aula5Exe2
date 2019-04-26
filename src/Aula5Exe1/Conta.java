package Aula5Exe1;


public class Conta {
    private int numConta;
    private float saldo;
    private String titular;

    public Conta(int numConta, float saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Conta(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //deposito
    public void deposito(double quantiaDin) {
        System.out.println("Fazendo deposito    no valor: R$" + quantiaDin);
        this.saldo += quantiaDin;
        System.out.println("Deposito realizado com sucesso " + this.titular + ", novo saldo R$ " + this.saldo);
    }

    //saque
    public void saque(double quantiaDin) {
        System.out.println("Efetuando saque    quantia: R$ " + quantiaDin);

        if (this.saldo < quantiaDin) {
            System.out.println("Saldo insuficiente " + this.titular + "===" + this.saldo);
            return;
        }

        this.saldo -= quantiaDin;
        System.out.println("Saque concluído " + this.titular + "seu novo saldo é R$ " + this.saldo);
    }

   }
