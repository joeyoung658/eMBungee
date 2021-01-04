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
            motdl.add(ChatColor.GREEN + "     Vote " + ChatColor.AQUA + " for our server" + ChatColor.GREEN + " daily " + ChatColor.AQUA + "for great rewards!");
            motdl.add(ChatColor.AQUA + "Check out our" + ChatColor.GREEN + " Website! " + ChatColor.RED+" Type " +ChatColor.AQUA + "/website for more info!");
            motdl.add(ChatColor.AQUA + "   Join our" + ChatColor.GREEN + " Discord!" + ChatColor.RED+" Type " +ChatColor.AQUA + "/discord for more info!");
            motdl.add(ChatColor.AQUA + "              All Ace is love. " + ChatColor.GREEN + "All Ace is life.");
        }}
    @EventHandler
    public void onProxyPing(ProxyPingEvent event) {
        Random rand = new Random();
        int  randomint = rand.nextInt(motdl.size()) + 0;
        event.getResponse().setDescriptionComponent(new TextComponent(ChatColor.YELLOW + "                   -"+ChatColor.GREEN+"-"+ChatColor.RED+"-"+ChatColor.YELLOW+"-"+ChatColor.RED+
                "All Ace"+ChatColor.GREEN+"-"+ChatColor.YELLOW+"-"+ChatColor.RED+"-"+ChatColor.GREEN+"-\n"+motdl.get(randomint)));
    }
}
