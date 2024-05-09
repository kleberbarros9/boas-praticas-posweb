package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {
        // Usando polimorfismo com a referência da classe base (Pessoa)
        Trabalhador pessoa = new Funcionario("João", 3000);
        PessoaBarulhenta pessoaBarulhenta = new PessoaBarulhenta("Maria");
        pessoaBarulhenta.fazerSom(); // Oi!

        // Violando o princípio da substituição de Liskov
        // Usando a referência da classe derivada (Funcionario)
        Funcionario funcionario = new Funcionario("Maria", 4000);
        pessoaBarulhenta.fazerSom(); // Bom dia!

    }
}
