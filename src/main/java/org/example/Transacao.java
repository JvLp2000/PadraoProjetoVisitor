package org.example;

public interface Transacao {
    String aceitar(FinanceiroVisitor visitor);
}