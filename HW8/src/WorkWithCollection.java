import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkWithCollection {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation name ");
        String nameOperation = input.nextLine();
        System.out.println("Enter path to the file");
        String path = input.nextLine();

        List<String> words = null;
        try {
            words = Arrays.asList(
                    new FileReader("src/main/files/example.txt").toString().split(" "));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(words);

        if(nameOperation.equals("frequency")){

        }
        else if(nameOperation.equals("length")){

        }
        else if(nameOperation.equals("duplicates")){

        }
    }
}
