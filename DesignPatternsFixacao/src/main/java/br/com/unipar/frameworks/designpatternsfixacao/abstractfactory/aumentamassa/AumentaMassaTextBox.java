package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.aumentamassa;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;

public class AumentaMassaTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Ganho de Massa TexBox!");
    }
}