package br.com.unipar.frameworks;

import br.com.unipar.frameworks.abstractfactory.app.ContactForm;
import br.com.unipar.frameworks.abstractfactory.lighttheme.LightThemeFactory;

public class DesignPatterns {

    public static void main(String[] args) {
        new ContactForm().render(new LightThemeFactory());
    }
}
