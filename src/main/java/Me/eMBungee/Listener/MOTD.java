package Me.eMBungee.Listener;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by josep on 27/07/2017.
 */
public class MOTD implements Listener {
    List<String> motdl = new ArrayList<String>(); {
        {

            motdl.add(ChatColor.RED + "                  Server Closed");
           // motdl.add(ChatColor.GREEN + "     Vote " + ChatColor.AQUA + " for our server" + ChatColor.GREEN + " daily " + ChatColor.AQUA + "for great rewards!");
            //motdl.add(ChatColor.AQUA + "Check out our" + ChatColor.GREEN + " Website! " + ChatColor.RED+" Type " + ChatColor.AQUA + "/website for more info!");
           //motdl.add(ChatColor.AQUA + "   Join our" + ChatColor.GREEN + " Discord!" + ChatColor.RED+" Type " +ChatColor.AQUA + "/discord for more info!");
            //motdl.add(ChatColor.AQUA + "       Join the" + ChatColor.GREEN + " Builder Of The Month " + ChatColor.RED +"competition!");
            motdl.add(ChatColor.AQUA + "                   eM is love. " + ChatColor.GREEN + "eM is life.");
            //motdl.add(ChatColor.AQUA + "                 eM is updated " + ChatColor.GREEN + "to 1.12.2!");
            //motdl.add(ChatColor.AQUA + "          Follow our" + ChatColor.GREEN + " Twitter" + ChatColor.AQUA +" at " +ChatColor.AQUA + "@Exhibit_MC!");
            //motdl.add(ChatColor.AQUA + "        eM " + ChatColor.RED + "wishes you a very " + ChatColor.GREEN + "Merry Christmas! ");
        }}
    @EventHandler
    public void onProxyPing(ProxyPingEvent event) {
        Random rand = new Random();
        int  randomint = rand.nextInt(motdl.size()) + 0;
//        event.getResponse().setDescription(ChatColor.YELLOW + "               -"+ChatColor.GREEN+"-"+ChatColor.RED+"-"+ChatColor.YELLOW+"-"+ChatColor.BLUE+
//                "Exhibit Minecraft"+ChatColor.GREEN+"-"+ChatColor.YELLOW+"-"+ChatColor.RED+"-"+ChatColor.GREEN+"-\n"+motdl.get(randomint));

        event.getResponse().setDescriptionComponent(new TextComponent(ChatColor.YELLOW +  "            -"+ChatColor.GREEN+"-"+ChatColor.RED+"-"
                +ChatColor.YELLOW+"-" +ChatColor.AQUA+
              ChatColor.BOLD +   "Exhibit Minecraft"+ ChatColor.RESET + ChatColor.GREEN+"-"+ChatColor.YELLOW+"-"+ChatColor.RED+"-"+ChatColor.GREEN+"-\n"+motdl.get(randomint)));



        //event.setMotd(ChatColor.BLUE + "                       www.Exhibit-Minecraft.com\n"+motdl.get(randomint));

    }


}
