package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransacaoVisitorTest {

    @Test
    public void testExibirReceita() {
        // Arrange
        Receita receita = new Receita(1, "Venda de Produto", 1500.00);
        TransacaoVisitor visitor = new TransacaoVisitor();

        // Act
        String resultado = receita.aceitar(visitor);

        // Assert
        assertEquals("Receita{id=1, descricao='Venda de Produto', valor=1500.0}", resultado);
    }

    @Test
    public void testExibirDespesa() {
        // Arrange
        Despesa despesa = new Despesa(2, "Compra de Equipamento", 500.00);
        TransacaoVisitor visitor = new TransacaoVisitor();

        // Act
        String resultado = despesa.aceitar(visitor);

        // Assert
        assertEquals("Despesa{id=2, descricao='Compra de Equipamento', valor=500.0}", resultado);
    }

    @Test
    public void testExibirInvestimento() {
        // Arrange
        Investimento investimento = new Investimento(3, "Ações", 2000.00);
        TransacaoVisitor visitor = new TransacaoVisitor();

        // Act
        String resultado = investimento.aceitar(visitor);

        // Assert
        assertEquals("Investimento{id=3, tipo='Ações', valor=2000.0}", resultado);
    }
}
