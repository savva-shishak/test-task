package testtask.operations;

public class Division extends Operation {
    public Division() {
        super("/", "div");
    }

    public float toCalc(int a, int b) {
        return (float) a / b;
    }
}
