import commands.pingPong;
import net.dv8tion.jda.api.*;

import javax.security.auth.login.LoginException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import net.dv8tion.jda.api.entities.Activity;


public class Main {

    public static String getToken(String fileName) {

        try {
            File fn = new File(fileName);
            Scanner sc = new Scanner(fn);
            while (sc.hasNextLine()) {

                return sc.nextLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("___________________________________________");
            System.out.println(ex.getStackTrace());
            System.out.println("___________________________________________");
        }

        return "null";
    }


    public static void main(String[] args) throws LoginException, InterruptedException{
        String fn = "C:\\Users\\Chelsea\\Documents\\tokens\\shoutyToken.txt";
        String token = getToken(fn);
        if (!token.equals("null")) {
            JDA jda = new JDABuilder(token)
                    .addEventListeners(new commands.pingPong())
                    .addEventListeners(new BotReadyEvent())
                    .addEventListeners(new commands.Moderation())
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .setActivity(Activity.listening("Not your Mom."))
                    .build();

            jda.awaitReady();
        } else{
            System.out.println("Token was bogus or missing.");
        }
    }
}
