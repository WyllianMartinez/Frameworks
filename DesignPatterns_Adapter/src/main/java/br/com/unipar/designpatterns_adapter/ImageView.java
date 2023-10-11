/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_adapter;

/**
 *
 * @author marti
 */
public class ImageView {
    
    private Image image;
    
    public ImageView(Image image){
        this.image = image;
    }
    
    public void apply (Filter filter){
        filter.apply(image);
    }
    
}
