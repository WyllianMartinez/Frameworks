package br.com.unipar.frameworks.designpatterns_adapter;

import br.com.unipar.frameworks.designpatterns_adapter.instalfilters.Caramel;

public class CaramelFilter implements Filter{
    private Caramel caramel;

    CaramelFilter(Caramel caramel){
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {

        caramel.init();
        caramel.render(image);
    }

}