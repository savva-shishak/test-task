package testtask.numbers;

import static testtask.numbers.TypeNumber.*;

public enum Number {
    JUST_ONE  (1, "1", JUST), JUST_TWO  (2, "2",   JUST),
    JUST_THREE(3, "3", JUST), JUST_FOUR (4, "4",   JUST),
    JUST_FIVE (5, "5", JUST), JUST_SIX  (6, "6",   JUST),
    JUST_SEVEN(7, "7", JUST), JUST_EIGHT(8, "8",   JUST),
    JUST_NINE (9, "9", JUST), JUST_TEN  (10, "10", JUST),

    WORD_ONE  (1, "one",   WORD), WORD_TWO  (2,  "two",   WORD),
    WORD_THREE(3, "three", WORD), WORD_FOUR (4,  "four",  WORD),
    WORD_FIVE (5, "five",  WORD), WORD_SIX  (6,  "six",   WORD),
    WORD_SEVEN(7, "seven", WORD), WORD_EIGHT(8,  "eight", WORD),
    WORD_NINE (9, "nine",  WORD), WORD_TEN  (10, "ten",   WORD),

    ROM_ONE  (1, "|",   ROM), ROM_TWO   (2,  "||",   ROM),
    ROM_THREE(3, "|||", ROM), ROM_FOUR  (4,  "|V",   ROM),
    ROM_FIVE (5, "V",   ROM), ROM_SIX   (6,  "V|",   ROM),
    ROM_SEVEN(7, "V||", ROM), ROM_EIGHT (8,  "V|||", ROM),
    ROM_NINE (9, "|V",  ROM), ROM_TEN   (10, "X",    ROM);

    public int value;
    public String romValue;
    public TypeNumber type;

    Number(int v, String r, TypeNumber t) {
        value = v;
        romValue = r;
        type = t;
    }

    public boolean equals(String value) {
        return romValue.equals(value);
    }
}
