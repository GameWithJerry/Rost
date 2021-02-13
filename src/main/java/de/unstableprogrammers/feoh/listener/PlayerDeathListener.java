package de.unstableprogrammers.feoh.listener;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    private FeOH plugin;

    public PlayerDeathListener(FeOH plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void handlePlayerDeath(PlayerDeathEvent event) {
        if(!(event.getEntity() instanceof Player)) {
            return;
        }

        event.setDeathMessage("");

    }
}
