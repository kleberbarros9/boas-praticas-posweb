package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

class Funcionario implements Trabalhador {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void calcularSalario() {
        // Lógica para calcular o salário do funcionário
    }
}
