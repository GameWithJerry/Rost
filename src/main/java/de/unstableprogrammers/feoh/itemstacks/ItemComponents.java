package de.unstableprogrammers.feoh.itemstacks;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemComponents {

    private FeOH plugin;

    private ArrayList<ItemStack> allItemComponents = new ArrayList<>();

    public ItemComponents(FeOH plugin) {
        this.plugin = plugin;
    }

}
