package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.treinandoforca;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.WidgetFactory;

public class TreinandoForcaFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new TreinandoForcaButton();
    }

    @Override
    public TextBox createTextBox() {
        return new TreinandoForcaTextBox();
    }

}