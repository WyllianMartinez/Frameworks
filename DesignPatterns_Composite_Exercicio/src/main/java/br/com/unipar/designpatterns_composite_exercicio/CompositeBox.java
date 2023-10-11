/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_composite_exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author marti
 */
public class CompositeBox implements Box {

    private final List<Box> childer = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        childer.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        return childer.stream().mapToDouble(Box::calculatePrice).sum();
    }
}
