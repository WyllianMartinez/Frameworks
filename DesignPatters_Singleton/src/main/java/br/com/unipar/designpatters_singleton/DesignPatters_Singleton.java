/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.designpatters_singleton;

/**
 *
 * @author marti
 */
public class DesignPatters_Singleton {

    public static void main(String[] args) {
        
        ConfigManager manager = ConfigManager.getInstance();
        manager.setLoggedInUser("Usuário Logado no Sistema!!!");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.getLoggedInUser());
        
    }
}