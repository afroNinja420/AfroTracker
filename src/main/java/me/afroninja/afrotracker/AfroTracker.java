package me.afroninja.afrotracker;

import org.bukkit.plugin.java.JavaPlugin;

public final class AfroTracker extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AfroTracker has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AfroTracker has been disabled!");
    }
}