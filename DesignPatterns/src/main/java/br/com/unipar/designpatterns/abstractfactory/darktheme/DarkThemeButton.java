/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns.abstractfactory.darktheme;

import br.com.unipar.designpatterns.abstractfactory.Button;

/**
 *
 * @author marti
 */
public class DarkThemeButton implements Button {

    @Override
    public void render() {
            System.err.println("DarkTheme Button!");
    }

}
