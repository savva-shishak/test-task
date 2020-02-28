package testtask.operations;

public abstract class Operation {

    private String[] tokens;

    Operation(String... t) {
        tokens = t;
    }

    public abstract float toCalc(int a, int b);

    public boolean isHereOperation(String token) {
        for (String t : tokens) {
            if (t.equals(token)) {
                return true;
            }
        }

        return false;
    }
}
