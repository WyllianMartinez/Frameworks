package br.com.unipar.frameworks;

public class DataSource extends Subject {

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
