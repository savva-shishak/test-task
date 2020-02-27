package testtask;

import testtask.caculators.*;
import testtask.exception.UnknownOperation;

public class Program {
    static Calculator[] calculators = {
            new Minus(),
            new Multiply(),
            new Plus(),
            new Division()
    };

    public static void main(String[] args) {
        ClientScanner clientScanner = new ClientScanner();

        clientScanner.requestData();

        for (Calculator calculator : calculators) {
            if (calculator.isHereOperation(clientScanner.operationName)) {
                System.out.println(calculator.toCalc(clientScanner.a, clientScanner.b));
                return;
            }
        }

        throw new UnknownOperation(clientScanner.operationName);
    }
}
