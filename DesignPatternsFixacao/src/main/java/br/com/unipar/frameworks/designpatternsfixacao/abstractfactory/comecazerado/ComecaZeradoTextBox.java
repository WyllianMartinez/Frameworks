package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.comecazerado;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;

public class ComecaZeradoTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("ComecouZero TextBox!");
    }

}