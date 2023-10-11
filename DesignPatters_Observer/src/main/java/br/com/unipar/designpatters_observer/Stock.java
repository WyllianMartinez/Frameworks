/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatters_observer;

/**
 *
 * @author marti
 */
public class Stock extends Subject {
    private String symbol;
    private float preco;

    public Stock(String symbol, float preco) {
        this.symbol = symbol;
        this.preco = preco;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
        notifyObservers();
    }
}