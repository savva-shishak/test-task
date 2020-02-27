package testtask.caculators;

public abstract class Calculator {

    private String token;

    Calculator(String t) {
        token = t;
    }

    public abstract float toCalc(int a, int b);

    public boolean isHereOperation(String token) {
        return this.token.equals(token);
    }
}
