package testtask.numbers;

public enum TypeNumber {
    JUST("Обычное число"), ROM("Римское число"), WORD("Слово");

    public String typeName;

    TypeNumber(String t) {
        typeName = t;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
