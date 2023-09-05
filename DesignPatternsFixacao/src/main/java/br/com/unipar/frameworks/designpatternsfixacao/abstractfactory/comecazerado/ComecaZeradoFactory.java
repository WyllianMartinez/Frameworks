package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.comecazerado;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.WidgetFactory;

public class ComecaZeradoFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new ComecaZeradoButton();
    }

    @Override
    public TextBox createTextBox() {
        return new ComecaZeradoTextBox();
    }

}