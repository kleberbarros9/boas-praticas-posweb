package br.unipe.boaspraticas.exercicios.oc;

public class Customer {
    private Name name;
    private Age age;
    private Money totalPurchaseAmount;

    public Customer(String name, int age) {
        this.name = new Name(name);
        this.age = new Age(age);
        this.totalPurchaseAmount = new Money(0);
    }

    public void makePurchase(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid purchase amount!");
            return;
        }

        this.totalPurchaseAmount.add(amount);
        System.out.println("Purchase successful!");

        if (this.age.isAdult()) {
            EmailService.sendEmailReceipt(amount);
        }
    }
}






