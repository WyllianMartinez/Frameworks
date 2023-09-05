package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.treinandoforca;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.TextBox;

public class TreinandoForcaTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Treino de Força TextBox!");
    }

}