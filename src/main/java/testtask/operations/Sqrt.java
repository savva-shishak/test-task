package testtask.operations;

public class Sqrt extends Operation {
    public Sqrt() {
        super("sqrt");
    }

    @Override
    public float toCalc(int a, int b) {
        return (float) Math.pow(a, 1.0 / b);
    }
}
