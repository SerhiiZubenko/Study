import org.apache.log4j.Logger;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Program.class.getName());

        public static int addition(int numberOne, int numberTwo){
            logger.info("Operation successful");
            return numberOne + numberTwo;
        }

        public static int substraction(int numberOne, int numberTwo){
            logger.warn("Operation warning");
            return numberOne - numberTwo;
        }

        public static int multiplication(int numberOne, int numberTwo){
            logger.debug("Debug level log");
            return numberOne * numberTwo;
        }

        public static double dividing(double numberOne, double numberTwo){
            if(numberTwo == 0) {
                logger.error("ERROR: You can't dividing by 0");
            }
            return numberOne / numberTwo;
        }

    public static String logLevel(String logLevel){
            return logLevel;
    }
}



