/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_adapter;

/**
 *
 * @author marti
 */
public class VividFilter implements Filter{
    
    @Override
    public void apply(Image image){
        System.out.println("Aplicando filtro vivido");
    }
   
    
}
