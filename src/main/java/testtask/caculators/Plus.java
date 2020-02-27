package testtask.caculators;

import testtask.caculators.Calculator;

public class Plus extends Calculator {
    public Plus() {
        super("+");
    }

    public float toCalc(int a, int b) {
        return a + b;
    }
}
