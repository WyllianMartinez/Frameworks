package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.perderpeso;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;

public class PerdendoPesoButton implements Button {

    @Override
    public void render() {
        System.out.println("Selecionou Perca de Peso!");
    }
}