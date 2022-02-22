package task2;

import java.io.IOException;
import java.util.Scanner;

public class Operations {

    public static void calculate() throws IOException {

        System.out.println("Enter operation - addition/ substraction/ multiplication/ dividing");
        Scanner str = new Scanner(System.in);
            String operation = str.next();

        if(!(operation.equals("addition") || operation.equals("substraction") || operation.equals("multiplication")
                || operation.equals("dividing"))) throw new IOException("Enter correct operation");

        if (operation.equals("addition")) {
            System.out.println("Enter two integer values");
            Scanner value = new Scanner(System.in);
            String a = value.next();
            String b = value.next();

            if(a.matches("[0-9]*") && b.matches("[0-9]*")){
                System.out.println("Result =" + (Integer.parseInt(a.trim()) + Integer.parseInt(b.trim())));
            } else throw new IOException("Invalid value");
        }

        if (operation.equals("substraction")) {
            System.out.println("Enter two integer values");
            Scanner value = new Scanner(System.in);
            String a = value.next();
            String b = value.next();

            if(a.matches("[0-9]*") && b.matches("[0-9]*")){
                System.out.println("Result =" + (Integer.parseInt(a.trim()) - Integer.parseInt(b.trim())));
            } else throw new IOException("Invalid value");
        }

        if (operation.equals("multiplication")) {
            System.out.println("Enter two integer values");
            Scanner value = new Scanner(System.in);
            String a = value.next();
            String b = value.next();

            if(a.matches("[0-9]*") && b.matches("[0-9]*")){
                System.out.println("Result =" + (Integer.parseInt(a.trim()) * Integer.parseInt(b.trim())));
            } else throw new IOException("Invalid value");

        }
        if (operation.equals("dividing")) {
            System.out.println("Enter two integer values");
            Scanner value = new Scanner(System.in);
            String a = value.next();
            String b = value.next();

            if(a.matches("[0-9]*") && b.matches("[0-9]*")){
                System.out.println("Result =" + (Integer.parseInt(a.trim()) / Integer.parseInt(b.trim())));
            }
            if (a.equals("0") || b.equals("0")) throw new ArithmeticException("Dividing by 0 is prohibited");
            else throw new IOException("Invalid value");
        }
    }
}
