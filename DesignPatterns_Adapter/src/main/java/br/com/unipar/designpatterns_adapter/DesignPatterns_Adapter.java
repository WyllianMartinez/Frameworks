/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.designpatterns_adapter;

import br.com.unipar.designpatterns_adapter.instaFilters.Caramel;

/**
 *
 * @author marti
 */
public class DesignPatterns_Adapter {

    public static void main(String[] args) {
        
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
        
    }
}
