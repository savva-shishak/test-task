package testtask;

import testtask.operations.*;
import testtask.exception.UnknownOperation;

public class Program {
    static Operation[] operations = {
            new Minus(),
            new Multiply(),
            new Plus(),
            new Division(),
            new Pow(),
            new Root()
    };

    public static void main(String[] args) {
        ClientData clientData = new ClientData();

        Operation operation = findOperation(clientData.operationName);

        float result = operation.toCalc(clientData.a, clientData.b);

        System.out.println(result);
    }

    static Operation findOperation(String operationName) {
        for (Operation operation : operations) {
            if (operation.isHereOperation(operationName)) {
                return operation;
            }
        }

        throw new UnknownOperation(operationName);
    }
}
