package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

public class Retangulo extends FormaGeometrica {
    private double altura;
    private double largura;

    // Construtor, getters e setters omitidos

    public double calcularArea() {
        return altura * largura;
    }
}
