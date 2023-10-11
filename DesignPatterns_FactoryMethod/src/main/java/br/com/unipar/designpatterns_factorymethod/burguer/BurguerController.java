/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod.burguer;

/**
 *
 * @author marti
 */
public class BurguerController extends ControllerAngus{

public void listProducts(){
    
       String nome = "Hamburguer Angus";
       
        montarBurguer(nome);
   
    }
}
