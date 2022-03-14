package Java;

public class Calculator {

    public static int addition(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static int substraction(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public static int dividing(int numberOne, int numberTwo){
        if(numberTwo == 0) {
            throw new IllegalArgumentException("You can't dividing by 0");
        }
        return numberOne / numberTwo;
    }
}
