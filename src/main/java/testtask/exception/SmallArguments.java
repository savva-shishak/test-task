package testtask.exception;

public class SmallArguments extends RuntimeException {
    @Override
    public String toString() {
        return "Не достаточно аргументов для проведения операции";
    }
}
