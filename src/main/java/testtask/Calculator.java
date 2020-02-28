package testtask;

import testtask.exception.UnknownOperation;
import testtask.operations.*;

public class Calculator {
    private Operation[] operations = {
            new Minus(),
            new Multiply(),
            new Plus(),
            new Division(),
            new Pow(),
            new Root()
    };

    public float toCalc(Data data) {
        Operation operation = findOperation(data.operationName);

        return operation.toCalc(data.a, data.b);
    }

    private Operation findOperation(String operationName) {
        for (Operation operation : operations) {
            if (operation.isHereOperation(operationName)) {
                return operation;
            }
        }

        throw new UnknownOperation(operationName);
    }
}
