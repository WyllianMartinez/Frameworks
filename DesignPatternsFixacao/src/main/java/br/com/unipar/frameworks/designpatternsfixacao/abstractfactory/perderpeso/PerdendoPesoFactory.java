package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.perderpeso;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;

public class PerdendoPesoFactory implements Button {

    @Override
    public void render() {
        System.out.println("Selecionou Perca de Peso!");
    }
}