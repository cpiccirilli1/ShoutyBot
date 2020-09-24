package commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Moderation extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event){

        Message msg = event.getMessage();
        String msgRaw = msg.getContentRaw().toLowerCase();
        if(msgRaw.startsWith("s!ban")){
            //Do the ban thing
        } else if(msgRaw.startsWith("s!kick")){
            //do the kick thing
        } else if(msgRaw.startsWith("s!mute")){
            //do the mute thing
        } else if(msgRaw.startsWith("s!remrole")){
            //do the remove role thing
        }



    }
}
