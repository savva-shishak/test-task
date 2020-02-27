package testtask;

import testtask.romnumbers.RomNumber;

import java.util.Scanner;

public class ClientScanner {
    public int a, b;
    public String operationName;

    private Scanner scanner = new Scanner(System.in);

    void requestData() {
        String response = scanner.nextLine();

        String[] responseItems = response.split(" ");

        operationName = responseItems[1];

        a = translateToNumber(responseItems[0]);
        b = translateToNumber(responseItems[2]);
    }

    int translateToNumber(String number) {
        for (RomNumber romNumber: RomNumber.values()) {
            if (romNumber.equals(number)) {
                return romNumber.value;
            }
        }

        return Integer.parseInt(number);
    }

}
