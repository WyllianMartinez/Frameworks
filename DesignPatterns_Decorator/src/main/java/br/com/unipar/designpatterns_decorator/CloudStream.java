/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_decorator;

/**
 *
 * @author marti
 */
public class CloudStream implements Stream{
    
    @Override
    public void write(String data){
        
        System.out.println("Story..."+data);
    }
    
}
