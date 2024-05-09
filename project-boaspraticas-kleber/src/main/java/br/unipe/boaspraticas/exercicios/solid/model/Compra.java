package br.unipe.boaspraticas.exercicios.solid.model;

import lombok.Data;

import java.util.List;

@Data
public class Compra {
    private List<ItemCompra> itemList;   //Lista de itens
    private double desconto; //desconto a ser aplicado

    // getters e setters omitidos
}
