package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

public class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor, getters e setters omitidos

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
