package br.unipe.boaspraticas.exercicios.oc;

public class Age {
    private int age;

    public Age(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}

