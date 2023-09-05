package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.app;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}