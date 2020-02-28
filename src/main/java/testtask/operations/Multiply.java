package testtask.operations;

public class Multiply extends Operation {
    public Multiply() {
        super("*", "mul");
    }

    public float toCalc(int a, int b) {
        return (float) a * b;
    }
}
