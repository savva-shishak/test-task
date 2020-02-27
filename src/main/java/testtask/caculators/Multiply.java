package testtask.caculators;

import testtask.caculators.Calculator;

public class Multiply extends Calculator {
    public Multiply() {
        super("*");
    }

    public float toCalc(int a, int b) {
        return (float) a * b;
    }
}
