package de.unstableprogrammers.feoh.main;

import de.unstableprogrammers.feoh.cratesandbarrels.BarrelManager;
import de.unstableprogrammers.feoh.cratesandbarrels.BlueBarrel;
import de.unstableprogrammers.feoh.cratesandbarrels.BrownBarrel;
import de.unstableprogrammers.feoh.cratesandbarrels.RedBarrel;
import de.unstableprogrammers.feoh.commands.*;
import de.unstableprogrammers.feoh.itemstacks.*;
import de.unstableprogrammers.feoh.listener.*;
import de.unstableprogrammers.feoh.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FeOH extends JavaPlugin {

    public final String PREFIX = "§4[§6Rust§4]§7 ",
                        CONSOLE_PREFIX = "§econsole.";

    //Classes
    private ItemMaterials itemMaterials;
    private ItemStacks itemStacks;
    private WorkStations workStations;
    private Inventorys inventorys;
    private ItemComponents itemComponents;
    private ItemBarrelsAndCrates itemBarrelsAndCrates;
    private BarrelManager barrelManager;

    //Barrels And Crates
    private BlueBarrel blueBarrel;
    private BrownBarrel brownBarrel;
    private RedBarrel redBarrel;

    @Override
    public void onEnable() {
        initialize(Bukkit.getPluginManager());
    }

    private void initialize(PluginManager pluginManager) {
        pluginManager.registerEvents(new PlayerJoinListener(this), this);
        pluginManager.registerEvents(new PlayerLeaveListener(this), this);
        pluginManager.registerEvents(new PlayerInteractListener(this), this);
        pluginManager.registerEvents(new PlayerBreakBlockListener(this), this);
        pluginManager.registerEvents(new PlayerPlaceBlockListener(this), this);
        pluginManager.registerEvents(new PlayerPickupItemListener(this), this);
        pluginManager.registerEvents(new MobSpawnListener(this), this);
        pluginManager.registerEvents(new InventoryClickListener(this), this);
        pluginManager.registerEvents(new PlayerDeathListener(this), this);

        this.getCommand("console").setExecutor(new RustConsoleCommands(this));

        itemMaterials = new ItemMaterials(this);
        itemStacks = new ItemStacks();
        workStations = new WorkStations(this);
        inventorys = new Inventorys(this);
        itemComponents = new ItemComponents(this);
        itemBarrelsAndCrates = new ItemBarrelsAndCrates(this);
        barrelManager = new BarrelManager(this);

        blueBarrel = new BlueBarrel(barrelManager, this);
        brownBarrel = new BrownBarrel(barrelManager, this);
        redBarrel = new RedBarrel(barrelManager, this);
    }

    //Classes
    public ItemMaterials getItemMaterials() {
        return itemMaterials;
    }
    public ItemStacks getItemStacks() { return itemStacks; }
    public WorkStations getWorkStations() { return workStations; }
    public Inventorys getInventorys() { return inventorys; }
    public ItemComponents getItemComponents() { return itemComponents; }
    public ItemBarrelsAndCrates getItemBarrelsAndCrates() { return itemBarrelsAndCrates; }

    //Crates And Barrels
    public BlueBarrel getBlueBarrel() { return blueBarrel; }
    public BrownBarrel getBrownBarrel() { return brownBarrel; }
    public RedBarrel getRedBarrel() { return redBarrel; }
}
