import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public double getInputNumber(String msg) {
        while (true) {
            try {
                System.out.print("Введите " + msg + " число: ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Не верный формат числа. Попробуйте ещё раз (Пример: 1,5)");
                scanner.nextLine();
            }
        }
    }

    public char getInputOperator() {
        System.out.print("Введите оператор (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
