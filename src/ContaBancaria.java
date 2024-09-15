public class ContaBancaria {
    private String contaCorrente;
    private String nome;
    private double saldo;

    // CONSTRUTOR
    public ContaBancaria(String numeroConta, String nome, double saldoInicial) {
        this.contaCorrente = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    // DEPÓSITO
    public void depositar(double valor) {
        if (valor > 0) {
            saldo =  saldo + valor;
            System.out.println("Depósito confirmado de: R$" + valor);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    // SACAR
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else if (valor > saldo) {
            System.out.println("Valor inválido.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    // SALDO
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
