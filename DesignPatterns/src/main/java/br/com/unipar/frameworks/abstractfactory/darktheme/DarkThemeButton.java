package br.com.unipar.frameworks.abstractfactory.darktheme;

import br.com.unipar.frameworks.abstractfactory.Button;

public class DarkThemeButton implements Button {

    @Override
    public void render() {
        System.err.println("DarkTheme Button!");
    }

}