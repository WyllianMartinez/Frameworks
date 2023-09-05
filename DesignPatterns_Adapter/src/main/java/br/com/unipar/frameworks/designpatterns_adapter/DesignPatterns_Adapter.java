package br.com.unipar.frameworks.designpatterns_adapter;

import br.com.unipar.frameworks.designpatterns_adapter.instalfilters.Caramel;

public class DesignPatterns_Adapter {

    public static void main(String[] args) {

        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

    }
}


