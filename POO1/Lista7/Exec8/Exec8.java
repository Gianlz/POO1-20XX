package lista7.Exec8;

import java.util.Random;

public class Exec8 {
    private int numeroConta;
    private String nome;
    private float saldo;

    Exec8(String nome, float saldo) {
        Random rand = new Random(100);
        setNumeroConta(rand.nextInt());
        alterarNome(nome);
        sacar(saldo);
    }

    Exec8(String nome) {
        alterarNome(nome);
    }

    public String depositar(float valor) {
        if (valor > 0) {
            setSaldo(saldo + valor);
            return "Deposito feito com sucesso!";
        }

        return "Valor de deposito invalido!";
    }

    public String sacar(float valor) {
        if (saldo >= valor) {
            setSaldo(saldo - valor);
            return "Saque feito com sucesso!";
        }

        return "Saldo insuficiente!";
    }

    public String alterarNome(String nome) {
        if (nome.trim().length() > 0) {
            this.setNome(nome);
            return "Nome alterado com sucesso!";
        }

        return "Nome inválido!";
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [numeroConta=" + numeroConta + ", nome=" + nome + ", saldo=" + saldo + "]";
    }
}