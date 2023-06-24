public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        double firstNum = view.getInputNumber("первое");
        char operator = view.getInputOperator();
        double secondNum = view.getInputNumber("второе");
        model.setResult(firstNum);

        switch (operator) {
            case '+':
                model.add(secondNum);
                break;
            case '-':
                model.subtract(secondNum);
                break;
            case '*':
                model.multiply(secondNum);
                break;
            case '/':
                while (secondNum == 0){
                    System.out.println("Деление на ноль, повторите ввод.");
                    secondNum = view.getInputNumber("второе");
                }
                model.divide(secondNum);
                break;
            default:
                System.out.println("Не верный оператор");
                return;
        }

        view.displayResult(model.getResult());
    }
}

