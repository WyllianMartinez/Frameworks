package br.com.unipar.frameworks.designpatterns_composite_exercicio.products;

public class Toxies extends Products {

    public Toxies(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

}