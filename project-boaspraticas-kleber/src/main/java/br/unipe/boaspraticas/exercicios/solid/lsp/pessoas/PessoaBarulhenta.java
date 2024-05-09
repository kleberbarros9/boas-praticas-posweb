package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class PessoaBarulhenta implements Pessoa {
    private String nome;

    public PessoaBarulhenta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void fazerSom() {
        System.out.println("Oi!");
    }
}
