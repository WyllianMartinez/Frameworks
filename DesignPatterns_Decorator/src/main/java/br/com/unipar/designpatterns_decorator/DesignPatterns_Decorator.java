/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.designpatterns_decorator;

/**
 *
 * @author marti
 */
public class DesignPatterns_Decorator {

    public static void main(String[] args) {
        storeCreditCard(new CloudStream());
     
    }
    
    public static void storeCreditCard(Stream stream){
        stream.write("1234 - 1234 - 1234 - 1234");
    }
}
