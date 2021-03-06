package de.unstableprogrammers.feoh.commands;

import de.unstableprogrammers.feoh.main.FeOH;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class GiveWorkStations implements CommandExecutor {

    private FeOH plugin;

    public GiveWorkStations(FeOH plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            return true;
        }

        if(player.isOp()) {
            Inventory workStationInv = Bukkit.createInventory(null, InventoryType.CHEST, "All Workstations");
            for(int i=0; i<=plugin.getWorkStations().getAllItemWorkStations().size()-1; i++) {
                workStationInv.setItem(i, plugin.getWorkStations().getAllItemWorkStations().get(i));
            }
            player.openInventory(workStationInv);
        }

        return false;
    }
}
