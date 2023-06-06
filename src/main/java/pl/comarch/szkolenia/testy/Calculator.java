package pl.comarch.szkolenia.testy;

public class Calculator {

    public Calculator() {
        System.out.println("konstruktor kalkulatora !!!");
    }

    public int add(int a, int b) {
        return a+b;
    }

    public double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return a/(double) b;
    }
}
