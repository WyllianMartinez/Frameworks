package br.com.unipar.frameworks;

public class Chart implements Observer{

    private DataSource dataSource;

    public Chart(DataSource dataSource){
        this.dataSource =dataSource;
    }

    public void update(){
        System.out.println("Chart got notified");
    }

}
