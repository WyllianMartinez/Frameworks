/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod.angus;

import br.com.unipar.designpatterns_factorymethod.burguer.ViewBurguer;

/**
 *
 * @author marti
 */
public class AngusViewEngine implements ViewBurguer{

    private String[] vetorAngus = {"Carne Angus", "Cheddar", "Molho Especial"}; 
    
    public String montarBurguer(String burguerName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Burguer Vegano: ");
        
        for (String item : vetorAngus) {
            builder.append(item).append(", ");
        }

        if (vetorAngus.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }

}
