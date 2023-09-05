package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.perderpeso;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;

public class PerdendoPesoTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Perda de peso TextBox");
    }

}