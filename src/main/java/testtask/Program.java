package testtask;

public class Program {
    static ClientDataScanner scanner = new ClientDataScanner();
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        System.out.println("Введите строку по шаблону:");
        System.out.println("<число> <операция> <число>");
        Data inputData = scanner.getData();

        System.out.print("Результат: ");
        float result = calculator.toCalc(inputData);

        System.out.println(result);
    }
}
