package br.com.unipar.frameworks.abstractfactory.darktheme;

import br.com.unipar.frameworks.abstractfactory.Button;
import br.com.unipar.frameworks.abstractfactory.TextBox;

public class DarkThemeTextBox implements TextBox {

    @Override
    public void render() {
        System.err.println("DarkTheme TexBox!");
    }

}
