package Java;

public class StringCalculator {

    public static int addString(String str) {

        if(str.startsWith("//")){
            String input = str.substring(2);
            String arr[] = input.split(";|\n");
            Integer number = 0;
            for(int i = 0; i<arr.length; i++){
                if(!arr[i].isEmpty() && Integer.parseInt(arr[i]) < 1000) {
                    number = number + Integer.parseInt(arr[i]);
                }
            }
            return number;
        }

        else if(str.contains(",")){
            String arr[] = str.split(",|\n");
            Integer number = 0;
            for(int i = 0; i<arr.length; i++){
                number = number + Integer.parseInt(arr[i]);
            }
            return number;
        }

        else if  (!str.isEmpty()) {
            return Integer.parseInt(str);
        }
        else
            return 0;
    }
}