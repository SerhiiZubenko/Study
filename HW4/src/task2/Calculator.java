package task2;

import static org.w3c.dom.events.MutationEvent.ADDITION;

public class Calculator {


    public static void main(String[] args) {

        Operations operation = Operations.ADDITION;
        operation.action(3, 5);
        operation = Operations.DIVIDING;
        operation.action(12, 3);

    }
}
