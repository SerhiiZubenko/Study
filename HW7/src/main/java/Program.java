import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter Log level");
        Scanner scaner = new Scanner(System.in);
        int value = scaner.nextInt();


        if(value == 1) {
            Properties properties = new Properties();
            InputStream input = Program.class.getClassLoader().
                    getResourceAsStream("log4jError.properties");
            properties.load(input);
        }
        else if(value == 2) {
            Properties properties = new Properties();
            FileReader fileReader = new FileReader("src/main/resources/log4jInfo.properties");
            properties.load(fileReader);
        }
        else if(value == 3) {
            Properties properties = new Properties();
            FileReader fileReader = new FileReader("src/main/resources/log4jDebug.properties");
            properties.load(fileReader);
        }



        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(2, 6));
        System.out.println(calculator.substraction(2, 6));
        System.out.println(calculator.multiplication(2, 6));
        System.out.println(calculator.dividing(2, 0));

    }
}

 //log4j.rootLogger = DEBUG, file, file1, stdout