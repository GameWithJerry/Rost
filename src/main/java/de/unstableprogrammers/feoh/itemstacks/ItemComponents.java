package de.unstableprogrammers.feoh.itemstacks;

import de.unstableprogrammers.feoh.main.FeOH;
import de.unstableprogrammers.feoh.utils.JsonFileParser;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ItemComponents {

    private FeOH plugin;
    private JsonFileParser json;

    private ArrayList<ItemStack> allItemComponents = new ArrayList<>();

    public ItemComponents(FeOH plugin) {
        this.plugin = plugin;
        this.json = new JsonFileParser("/assets/items/ItemComponents.json");

        initializeItemComponents();
    }

    public void initializeItemComponents() {
        JSONArray array = json.get().getJSONArray("ItemComponents");

        for (int i = 0; i < array.length(); i++) {
            addComponentToArray(JSONObjectToItemStack(array.getJSONObject(i)));
        }
    }

    public ItemStack JSONObjectToItemStack(JSONObject object) {
        ItemStack itemstack = new ItemStack(Material.getMaterial(object.getString("Material")));
        itemstack.setAmount(object.getInt("Amount"));

        ItemMeta itemmeta = itemstack.getItemMeta();
        itemmeta.setDisplayName(object.getString("Name"));
        itemstack.setItemMeta(itemmeta);

        return itemstack;
    }

    public ArrayList<ItemStack> getAllItemComponents() { return allItemComponents; }
    public void addComponentToArray(ItemStack itemStack) { allItemComponents.add(itemStack); }
}
