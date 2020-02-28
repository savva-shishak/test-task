package testtask.operations;

public class Root extends Operation {
    public Root() {
        super("root");
    }

    @Override
    public float toCalc(int a, int b) {
        return (float) Math.pow(a, 1.0 / b);
    }
}
