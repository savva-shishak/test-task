package testtask.romnumbers;

public enum RomNumber {
    ONE  (1, "|"),   TWO  (2, "||"),
    THREE(3, "|||"), FOUR (4, "|V"),
    FIVE (5, "V"),   SIX  (6, "V|"),
    SEVEN(7, "V||"), EIGHT(8, "V|||"),
    NINE (9, "|V"),  TEN  (10, "X");

    public int value;
    public String romValue;

    RomNumber(int v, String r) {
        value = v;
        romValue = r;
    }

    public boolean equals(String value) {
        return romValue.equals(value);
    }
}
