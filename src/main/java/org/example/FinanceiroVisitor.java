package org.example;

public interface FinanceiroVisitor {

    String exibirReceita(Receita receita);
    String exibirDespesa(Despesa despesa);
    String exibirInvestimento(Investimento investimento);

}