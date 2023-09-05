package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.aumentamassa;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;

public class AumentaMassaButton implements Button {

    @Override
    public void render() {
        System.out.println("Selecionou ganho de massa, Button!");
    }

}