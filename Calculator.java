class Calculator {
    Calculator getObject() {
        return this;
    }

    void calculate() {
        System.out.println("Calculation started");
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.getObject().calculate();
    }
}