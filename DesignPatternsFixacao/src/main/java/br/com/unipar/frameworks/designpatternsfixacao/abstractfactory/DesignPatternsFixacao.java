package br.com.unipar.frameworks.designpatternsfixacao.abstractfactory;

import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.app.ContactForm;
import br.com.unipar.frameworks.designpatternsfixacao.abstractfactory.treinandoforca.TreinandoForcaFactory;

public class DesignPatternsFixacao {
    public static void main(String[] args) {

        new ContactForm().render(new TreinandoForcaFactory());

    }
}
