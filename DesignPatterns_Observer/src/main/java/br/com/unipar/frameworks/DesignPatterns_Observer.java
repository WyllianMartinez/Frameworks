package br.com.unipar.frameworks;


public class DesignPatterns_Observer {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        SpreadSheet sheet = new SpreadSheet(dataSource);

        SpreadSheet sheet1 = new SpreadSheet(dataSource);

        Chart chart = new Chart(dataSource);

        dataSource.addObserver(sheet);
        dataSource.addObserver(sheet1);
        dataSource.addObserver(chart);

        dataSource.setValue(35);
    }
}
