package testtask.caculators;

import testtask.caculators.Calculator;

public class Division extends Calculator {
    public Division() {
        super("/");
    }

    public float toCalc(int a, int b) {
        return (float) a / b;
    }
}
