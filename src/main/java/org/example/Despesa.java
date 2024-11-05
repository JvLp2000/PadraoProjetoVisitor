package org.example;

public class Despesa implements Transacao {

    private int id;
    private String descricao;
    private double valor;

    public Despesa(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String aceitar(FinanceiroVisitor visitor) {
        return visitor.exibirDespesa(this);
    }
}