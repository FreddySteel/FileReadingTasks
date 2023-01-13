import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void WholeFileRead() {
        List<String> listOfNames = new ArrayList();
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter username");
        String userName = myInput.nextLine();  // Read user input

        try {
            FileReader fr = new FileReader("data");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                listOfNames.add(line);
                if (userName.equals(line)) {
                    System.out.println("Found it");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(listOfNames);
    }
}