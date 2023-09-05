package br.com.unipar.frameworks.abstractfactory.lighttheme;

import br.com.unipar.frameworks.abstractfactory.TextBox;

public class LightThemeTextBox implements TextBox {

    @Override
    public void render() {
        System.err.println("LightTheme TexBox");
    }

}
