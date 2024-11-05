package org.example;

public class TransacaoVisitor implements FinanceiroVisitor {

    @Override
    public String exibirReceita(Receita receita) {
        return "Receita{" +
                "id=" + receita.getId() +
                ", descricao='" + receita.getDescricao() + '\'' +
                ", valor=" + receita.getValor() +
                '}';
    }

    @Override
    public String exibirDespesa(Despesa despesa) {
        return "Despesa{" +
                "id=" + despesa.getId() +
                ", descricao='" + despesa.getDescricao() + '\'' +
                ", valor=" + despesa.getValor() +
                '}';
    }

    @Override
    public String exibirInvestimento(Investimento investimento) {
        return "Investimento{" +
                "id=" + investimento.getId() +
                ", tipo='" + investimento.getTipo() + '\'' +
                ", valor=" + investimento.getValor() +
                '}';
    }
}