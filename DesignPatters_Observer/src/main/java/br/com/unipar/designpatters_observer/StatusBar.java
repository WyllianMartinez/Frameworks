/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatters_observer;

import java.util.List;

/**
 *
 * @author marti
 */
public class StatusBar implements Observer {
    private List<Stock> favoriteStocks; 

    public StatusBar(List<Stock> favoriteStocks) {
        this.favoriteStocks = favoriteStocks;

        for (Stock stock : favoriteStocks) {
            stock.addObserver(this);
        }
    }

    @Override
    public void update() {
        System.out.println("\n StatusBar: ");
        for (Stock stock : favoriteStocks) {
            System.out.println(stock.getSymbol() + " - " + stock.getPreco());
        }
    }
}