/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod.angus;

import br.com.unipar.designpatterns_factorymethod.burguer.AngusViewEngine;
import br.com.unipar.designpatterns_factorymethod.burguer.ControllerAngus;
import br.com.unipar.designpatterns_factorymethod.burguer.ViewBurguer;

/**
 *
 * @author marti
 */
public class AngusController extends ControllerAngus{


    @Override
    protected ViewBurguer createViewEngine(){
    return new AngusViewEngine();
    }
}
