package testtask.operations;

public class Minus extends Operation {
    public Minus() {
        super("-", "minus");
    }

    public float toCalc(int a, int b) {
        return (float) a - b;
    }
}
