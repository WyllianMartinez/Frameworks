/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns.abstractfactory.darktheme;

import br.com.unipar.designpatterns.abstractfactory.Button;
import br.com.unipar.designpatterns.abstractfactory.TextBox;
import br.com.unipar.designpatterns.abstractfactory.WidgetFactory;

/**
 *
 * @author marti
 */
public class DarkThemeFactory implements WidgetFactory{

    @Override
    public Button createButton() {
       return new DarkThemeButton();
    }

    @Override
    public TextBox createTextBox() {
       return new DarkThemetTextBox();
    }
    
    
    
}
