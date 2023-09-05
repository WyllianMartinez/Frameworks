package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.comecazerado;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;

public class ComecaZeradoButton implements Button {

    @Override
    public void render() {
        System.out.println("Selecionou começou do zero, Button!");
    }

}
