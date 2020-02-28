package testtask.exception;

import testtask.numbers.TypeNumber;

public class VariousNumberTypes extends RuntimeException {
    private TypeNumber type1, type2;

    public VariousNumberTypes(TypeNumber t1, TypeNumber t2) {
        type1 = t1;
        type2 = t2;
    }

    @Override
    public String toString() {
        return "Разные типы переменных: \"" + type1 + " : \"" + type2 + "\"";
    }
}
