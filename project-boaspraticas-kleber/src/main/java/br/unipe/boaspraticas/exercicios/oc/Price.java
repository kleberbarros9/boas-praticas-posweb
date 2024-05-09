package br.unipe.boaspraticas.exercicios.oc;

public class Price {
    private double value;

    public Price(double value) {
        if (value < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.value = value;
    }

    public void add(Price other) {
        this.value += other.value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%.2f", value);
    }
}