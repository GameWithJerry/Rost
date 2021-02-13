package de.unstableprogrammers.feoh.cratesandbarrels;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;

public class BrownBarrel extends Barrel {

    private BarrelManager barrelManager;
    private FeOH plugin;

    public BrownBarrel(BarrelManager barrelManager, FeOH plugin) {
        this.barrelManager = barrelManager;
        this.plugin = plugin;
    }
    @Override
    public void generateLoot(Player player, Location location, int chance) {}
}