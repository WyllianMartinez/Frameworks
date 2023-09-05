package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.treinandoforca;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.Button;

public class TreinandoForcaButton implements Button {

        @Override
        public void render() {

            System.out.println("Seleciono o Treino de Força Button!");

        }



    }