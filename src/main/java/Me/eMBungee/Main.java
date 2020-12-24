package Me.eMBungee;


import Me.eMBungee.Listener.MOTD;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Created by josep on 27/07/2017.
 */
public class Main extends Plugin {
    @Override
    public void onEnable() {
        registerListenter();
    }

    private void registerListenter(){
        getProxy().getPluginManager().registerListener(this, new MOTD());
    }

    private void registerCommand(){
        
    }

}
