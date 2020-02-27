package testtask.caculators;

import testtask.caculators.Calculator;

public class Minus extends Calculator {
    public Minus() {
        super("-");
    }

    public float toCalc(int a, int b) {
        return (float) a - b;
    }
}
