package de.unstableprogrammers.rust.listener;

import de.unstableprogrammers.rust.main.Rust;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class MobSpawnListener implements Listener {

    private Rust plugin;

    public MobSpawnListener(Rust plugin) {
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
