/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns.abstractfactory.lighttheme;

import br.com.unipar.designpatterns.abstractfactory.Button;
import br.com.unipar.designpatterns.abstractfactory.TextBox;
import br.com.unipar.designpatterns.abstractfactory.WidgetFactory;

/**
 *
 * @author marti
 */
public class LightThemeFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightThemeTextBox();
    }
    
}
