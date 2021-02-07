package de.unstableprogrammers.feoh.itemstacks;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemBarrelsAndCrates {

    private FeOH plugin;

    private ArrayList<Material> BarrelMaterials = new ArrayList<>();
    private ArrayList<ItemStack> BarrelItems = new ArrayList<>();

    public ItemBarrelsAndCrates(FeOH plugin) {
        this.plugin = plugin;

        BarrelMaterials.add(Material.LOOM);
        BarrelItems.add(getBrownBarrel());
    }

    public ItemStack getBrownBarrel() {
        ItemStack brownBarrel = new ItemStack(Material.LOOM);
        ItemMeta brownBarrelMeta = brownBarrel.getItemMeta();
        brownBarrelMeta.setDisplayName("Brown Barrel");
        brownBarrel.setItemMeta(brownBarrelMeta);

        return brownBarrel;
    }

    public ArrayList<Material> getBarrelMaterials() { return BarrelMaterials; }
    public ArrayList<ItemStack> getBarrelItems() { return BarrelItems; }
}
