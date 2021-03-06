package de.unstableprogrammers.feoh.listener;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    private FeOH plugin;

    public PlayerJoinListener(FeOH plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(plugin.PREFIX + player.getDisplayName() + " ist gerade dem Server beigetreten");

        player.getInventory().setMaxStackSize(1000);
        player.getInventory().setItem(17, plugin.getItemStacks().getInvCraftingPlaceHolder());
        player.getInventory().setItem(0, plugin.getTools().getRock());
        player.getInventory().setItem(1, plugin.getTools().getTorch());


        
    }

}
