/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_adapter;

import br.com.unipar.designpatterns_adapter.instaFilters.Caramel;
import com.sun.jdi.Field;

/**
 *
 * @author marti
 */
public class CaramelFilter implements Filter{
    
    private Caramel caramel;
    
    CaramelFilter(Caramel caramel){
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {

        caramel.init();
        caramel.render(image);
    }
    
}
