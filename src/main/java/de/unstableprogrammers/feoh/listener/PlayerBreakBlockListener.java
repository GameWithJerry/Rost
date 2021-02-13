package de.unstableprogrammers.feoh.listener;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
public class PlayerBreakBlockListener implements Listener {


    private FeOH plugin;

    public PlayerBreakBlockListener(FeOH plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerBreakMaterials(BlockBreakEvent event) {
        if(event.getPlayer() == null) {
            return;
        }
        Player player = event.getPlayer();

        if(!(event.getPlayer().getGameMode().equals(GameMode.SURVIVAL))) {
            return;
        }

        event.setCancelled(true);
    }
}