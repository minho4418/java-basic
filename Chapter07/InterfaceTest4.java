package chapter7;

interface ICalculator {

    int add(int x, int y);
    int sub(int x, int y);

    default int mul(int x, int y) {

        return x * y;
    }

    static void print(int value) {

        System.out.println(value);
    }
}

class Calculator implements ICalculator {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    public int mul(int x, int y) {

        return x * y;
    }
}

public class InterfaceTest4 {
    public static void main(String[] args) {

        ICalculator cal = new Calculator();
        int result = cal.mul(5, 3);
        System.out.println("5 * 3 = " + result);
        ICalculator.print(100);
    }
}

