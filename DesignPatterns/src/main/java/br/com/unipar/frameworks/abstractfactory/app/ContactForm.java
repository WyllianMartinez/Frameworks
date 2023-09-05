package br.com.unipar.frameworks.abstractfactory.app;

import br.com.unipar.frameworks.abstractfactory.WidgetFactory;

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

