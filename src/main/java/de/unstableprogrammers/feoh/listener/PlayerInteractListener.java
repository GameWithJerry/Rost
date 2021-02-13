package de.unstableprogrammers.feoh.listener;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    private FeOH plugin;

    public PlayerInteractListener(FeOH plugin) {
        this.plugin = plugin;
    }

}
