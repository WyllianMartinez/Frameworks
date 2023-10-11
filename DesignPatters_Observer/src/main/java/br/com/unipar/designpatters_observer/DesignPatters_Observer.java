/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.designpatters_observer;
import java.util.Arrays;
/**
 *
 * @author marti
 */
public class DesignPatters_Observer {

    public static void main(String[] args) {
        Stock acao1 = new Stock("Coca-Cola", 150f);
        Stock acao2 = new Stock("Sukita", 400f);

        StatusBar statusBar = new StatusBar(Arrays.asList(acao1, acao2));
        StockListView stockListView = new StockListView(Arrays.asList(acao1, acao2));

        //SetPrice p/ atualizar o preço
        acao1.setPreco(200f);
        acao2.setPreco(400f);
    }
   
}