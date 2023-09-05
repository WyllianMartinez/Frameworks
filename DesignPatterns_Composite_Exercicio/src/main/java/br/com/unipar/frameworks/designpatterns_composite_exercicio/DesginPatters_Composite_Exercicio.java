package br.com.unipar.frameworks.designpatterns_composite_exercicio;

import br.com.unipar.frameworks.designpatterns_composite_exercicio.products.Juice;
import br.com.unipar.frameworks.designpatterns_composite_exercicio.products.Toxies;

public class DesginPatters_Composite_Exercicio {
    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new Juice("SUCO", 300.00)
                ),
                new CompositeBox(
                        new Toxies("TOXICO 1", 80.15),
                        new Toxies("CREATINA", 70.65)
                ),
                new Juice("TREMBOLONA", 3000.15)
        );

        System.out.println("TOTAL GASTO: " +
                deliveryService.calculateOrderPrice());
    }
}