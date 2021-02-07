package de.unstableprogrammers.feoh.cratesandbarrels;

import de.unstableprogrammers.feoh.main.FeOH;

public class BarrelManager {

    private FeOH plugin;
    private Barrel[] barrels;

    public BarrelManager(FeOH plugin) {
        this.plugin = plugin;
        barrels = new Barrel[3];

        barrels[Barrel.BLUE_BARREL] = new BlueBarrel(this, plugin);
        barrels[Barrel.BROWN_BARREL] = new BrownBarrel(this, plugin);
        barrels[Barrel.RED_BARREL] = new RedBarrel(this, plugin);
    }

}
