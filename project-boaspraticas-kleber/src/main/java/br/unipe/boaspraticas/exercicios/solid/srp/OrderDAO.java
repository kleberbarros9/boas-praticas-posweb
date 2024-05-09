package br.unipe.boaspraticas.exercicios.solid.srp;

import br.unipe.boaspraticas.exercicios.solid.model.Item;

public class OrderDAO {
    private Order order;
    
    public void calculateTotalPrice() {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getP();
        }
        System.out.println("Total Price: " + total);
    }

    public void saveOrderToDatabase() {
        // Código para salvar o pedido no banco de dados
        System.out.println("Order saved to database.");
    }
}
