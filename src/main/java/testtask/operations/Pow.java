package testtask.operations;

public class Pow extends Operation {
    public Pow() {
        super("**", "pow");
    }

    @Override
    public float toCalc(int a, int b) {
        return (float) Math.pow(a, b);
    }
}
