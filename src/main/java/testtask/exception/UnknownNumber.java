package testtask.exception;

public class UnknownNumber extends RuntimeException {
    private String number;

    public UnknownNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Не известное число: \"" + number + "\"";
    }
}
