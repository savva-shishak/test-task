package testtask.operations;

public class Plus extends Operation {
    public Plus() {
        super("+", "plus");
    }

    public float toCalc(int a, int b) {
        return a + b;
    }
}
