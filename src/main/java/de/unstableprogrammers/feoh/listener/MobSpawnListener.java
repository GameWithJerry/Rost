package de.unstableprogrammers.feoh.listener;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class MobSpawnListener implements Listener {

    private FeOH plugin;

    public MobSpawnListener(FeOH plugin) {
        this.plugin = plugin;
    }

    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if(event.getEntity() == null) {
            return;
        }

        event.setCancelled(true);
    }

    public void onEntitySpawn(EntitySpawnEvent event) {
        if(event.getEntity() == null) {
            return;
        }

        event.setCancelled(true);
    }

}
