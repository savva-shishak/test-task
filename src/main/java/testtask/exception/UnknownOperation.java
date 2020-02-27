package testtask.exception;

public class UnknownOperation extends RuntimeException {

    String operationName;

    public UnknownOperation(String name) {
        operationName = name;
    }

    @Override
    public String toString() {
        return "Не известная операция \"" + operationName + "\"";
    }
}
