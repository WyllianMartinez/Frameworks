package br.com.unipar.frameworks.abstractfactory.darktheme;

import br.com.unipar.frameworks.abstractfactory.Button;
import br.com.unipar.frameworks.abstractfactory.TextBox;
import br.com.unipar.frameworks.abstractfactory.WidgetFactory;

public class DarkThemeFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkThemeTextBox();
    }



}