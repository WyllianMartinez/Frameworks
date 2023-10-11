/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns.abstractfactory.lighttheme;

import br.com.unipar.designpatterns.abstractfactory.Button;

/**
 *
 * @author marti
 */
public class LightThemeButton implements Button{

    @Override
    public void render() {
        System.out.println("LightTheme Button!");
    }
    
}
