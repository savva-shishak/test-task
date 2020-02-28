package testtask;

import testtask.exception.SmallArguments;
import testtask.exception.UnknownNumber;
import testtask.exception.VariousNumberTypes;
import testtask.numbers.Number;

import java.util.Scanner;

public class ClientData {
    public int a, b;
    public String operationName;

    public ClientData() {
        String[] response = requestData();

        operationName = response[1];

        setNumbers(response[0], response[2]);
    }

    String[] requestData() {
        Scanner scanner = new Scanner(System.in);
        String[] response = scanner.nextLine().split(" ");

        if (response.length < 3) {
            throw new SmallArguments();
        }

        return response;
    }

    void setNumbers(String strA, String strB) {
        Number a = findNumber(strA);
        Number b = findNumber(strB);

        if (!a.type.equals(b.type)) {
            throw new VariousNumberTypes(a.type, b.type);
        }

        this.a = a.value;
        this.b = b.value;
    }

    Number findNumber(String str) {
        for (Number number : Number.values()) {
            if (number.equals(str)) {
                return number;
            }
        }

        throw new UnknownNumber(str);
    }
}
