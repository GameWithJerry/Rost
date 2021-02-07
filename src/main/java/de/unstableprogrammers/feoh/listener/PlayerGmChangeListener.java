package de.unstableprogrammers.feoh.listener;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class PlayerGmChangeListener implements Listener {

    private FeOH plugin;

    public PlayerGmChangeListener(FeOH plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerGmChange(PlayerGameModeChangeEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(event.getNewGameMode().equals(GameMode.SURVIVAL)) {
            player.getInventory().setItem(17, plugin.getItemStacks().getInvCraftingPlaceHolder());
        } else if(event.getNewGameMode().equals(GameMode.CREATIVE)) {
            player.getInventory().setItem(17, plugin.getItemStacks().getNothing());
        }
    }

}
