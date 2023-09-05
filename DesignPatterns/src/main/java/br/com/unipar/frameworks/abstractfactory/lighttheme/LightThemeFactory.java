package br.com.unipar.frameworks.abstractfactory.lighttheme;

import br.com.unipar.frameworks.abstractfactory.Button;
import br.com.unipar.frameworks.abstractfactory.TextBox;
import br.com.unipar.frameworks.abstractfactory.WidgetFactory;

public class LightThemeFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightThemeTextBox();
    }

}
