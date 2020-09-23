import net.dv8tion.jda.api.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static String getToken(String fileName) {

        try {
            File fn = new File(fileName);
            Scanner sc = new Scanner(fn);
            while (sc.hasNextLine()) {

                return sc.nextLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }

        return "null";
    }


    public static void main(String[] args) throws Exception{
        String fn = "C:\\Users\\Chelsea\\Documents\\tokens\\shoutyToken.txt";
        String token = getToken(fn);

        JDA jda = new JDABuilder(token).build();


        jda.awaitReady();
    }
}
