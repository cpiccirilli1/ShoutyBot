import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotReadyEvent extends ListenerAdapter {
    public void onReady(ReadyEvent event) {
        System.out.println("I'm ready, I'm ready, I'm ready!");
    }
}
