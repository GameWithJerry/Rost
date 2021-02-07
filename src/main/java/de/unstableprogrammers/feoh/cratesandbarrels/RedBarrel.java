package de.unstableprogrammers.feoh.cratesandbarrels;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class RedBarrel extends Barrel {

    private BarrelManager barrelManager;
    private FeOH plugin;

    private ArrayList<ItemStack> loot = new ArrayList<>();

    public RedBarrel(BarrelManager barrelManager, FeOH plugin) {
        this.barrelManager = barrelManager;
        this.plugin = plugin;
    }

    @Override
    public void generateLoot(Player player, Location location, int chance) {
        loot.add(plugin.getItemMaterials().getLowGradeFuel(5));
        loot.add(plugin.getItemMaterials().getCrudeOil(15));

        player.sendMessage("opening");

        for(int i=0; i<1;i++) {
            location.getWorld().dropItem(location, loot.get(i));
        }
    }

}
