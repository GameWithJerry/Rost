package de.unstableprogrammers.rust.ressources;

import de.unstableprogrammers.rust.main.Rust;
import org.bukkit.Bukkit;

public class StoneNodeRespawn {

    private Rust plugin;

    public StoneNodeRespawn(Rust plugin) {
        this.plugin = plugin;
    }

    void checkRespawnTimer() {
        if(!(plugin.getConfig().getInt("ressources.respawntimer") == 0)) {
            return;
        }

        nodeRespawn();
    }

    void nodeRespawn() {
        Bukkit.broadcastMessage("Stone nodes have respawned.");
    }

}
