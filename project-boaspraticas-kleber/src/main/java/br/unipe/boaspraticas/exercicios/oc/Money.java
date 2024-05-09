package br.unipe.boaspraticas.exercicios.oc;

public class Money {
    private double amount;

    public Money(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        this.amount = amount;
    }

    public void add(double amt) {
        this.amount += amt;
    }
}
