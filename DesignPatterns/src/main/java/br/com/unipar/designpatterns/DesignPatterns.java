/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.designpatterns;

import br.com.unipar.designpatterns.abstractfactory.app.ContactForm;
import br.com.unipar.designpatterns.abstractfactory.app.ThemeEnum;
import br.com.unipar.designpatterns.abstractfactory.lighttheme.LightThemeFactory;

/**
 *
 * @author marti
 */
public class DesignPatterns {

    public static void main(String[] args) {
        new ContactForm().render(new LightThemeFactory());
    }
}
