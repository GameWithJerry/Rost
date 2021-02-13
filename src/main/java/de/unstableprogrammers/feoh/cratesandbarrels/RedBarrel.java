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
    public void generateLoot(Player player, Location location, int chance) {}

}
