/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns.abstractfactory.app;

import br.com.unipar.designpatterns.abstractfactory.WidgetFactory;
import br.com.unipar.designpatterns.abstractfactory.darktheme.DarkThemeButton;
import br.com.unipar.designpatterns.abstractfactory.darktheme.DarkThemetTextBox;
import br.com.unipar.designpatterns.abstractfactory.lighttheme.LightThemeButton;
import br.com.unipar.designpatterns.abstractfactory.lighttheme.LightThemeTextBox;
import javax.xml.parsers.FactoryConfigurationError;

/**
 *
 * @author marti
 */
public class ContactForm {
    
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    
//    public void render(ThemeEnum theme){
//        if(theme.equals(ThemeEnum.DARK_THEME)){
//            
//            new DarkThemeButton().render();
//            new DarkThemetTextBox().render();
//            
//        }else if(theme.equals(ThemeEnum.LIGHT_THEME)){
//        
//            new LightThemeButton().render();
//            new LightThemeTextBox().render();
//        
//    }
//        
        
        
    }
    
}
