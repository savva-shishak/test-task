package testtask;

import testtask.exception.SmallArguments;
import testtask.exception.UnknownNumber;
import testtask.exception.VariousNumberTypes;
import testtask.numbers.Number;

import java.util.Scanner;

public class ClientDataScanner {
    Data getData() {
        String[] response = requestData();

        Data result = new Data();

        result.operationName = response[1];

        setNumbers(response[0], response[2], result);

        return result;
    }

    private String[] requestData() {
        Scanner scanner = new Scanner(System.in);
        String[] response = scanner.nextLine().split(" ");

        if (response.length < 3) {
            throw new SmallArguments();
        }

        return response;
    }

    private void setNumbers(String strA, String strB, Data obj) {
        Number a = findNumber(strA);
        Number b = findNumber(strB);

        if (!a.type.equals(b.type)) {
            throw new VariousNumberTypes(a.type, b.type);
        }

        obj.a = a.value;
        obj.b = b.value;
    }

    private Number findNumber(String str) {
        for (Number number : Number.values()) {
            if (number.equals(str)) {
                return number;
            }
        }

        throw new UnknownNumber(str);
    }
}
