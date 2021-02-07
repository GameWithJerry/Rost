package de.unstableprogrammers.feoh.ressources;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Bukkit;

public class StoneNodeRespawn {

    private FeOH plugin;

    public StoneNodeRespawn(FeOH plugin) {
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
