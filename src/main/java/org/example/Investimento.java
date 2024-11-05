package org.example;

public class Investimento implements Transacao {

    private int id;
    private String tipo;
    private double valor;

    public Investimento(int id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String aceitar(FinanceiroVisitor visitor) {
        return visitor.exibirInvestimento(this);
    }
}
