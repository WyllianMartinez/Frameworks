/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod.burguer;

/**
 *
 * @author marti
 */
public class AngusViewEngine implements ViewBurguer{

    //Inserir Vetor aqui
    
    String[] vetorVegano = {"Carne de Soja", "Alface", "Tofu"};
    
    public String montarBurguer(String burguerName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Burguer Vegano: ");
        
        for (String item : vetorVegano) {
            builder.append(item).append(", ");
        }

        if (vetorVegano.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }



    
}
