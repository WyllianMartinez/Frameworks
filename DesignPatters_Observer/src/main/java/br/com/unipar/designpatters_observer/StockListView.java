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
public class StockListView implements Observer {
    private List<Stock> stocks;

    public StockListView(List<Stock> stocks) {
        this.stocks = stocks;

        for (Stock stock : stocks) {
            stock.addObserver(this);
        }
    }

    @Override
    public void update() {
        System.out.println("\n StockListView: ");
        for (Stock stock : stocks) {
            System.out.println(stock.getSymbol() + " - " + stock.getPreco());
        }
    }
}