package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.aumentamassa;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.WidgetFactory;

public class AumentaMassaFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AumentaMassaButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AumentaMassaTextBox();
    }

}