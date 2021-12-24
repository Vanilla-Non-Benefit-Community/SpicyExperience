package org.minecraft.server.wolf.spicyexperience;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class SpicyExperience extends JavaPlugin {
    public static JavaPlugin instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        saveDefaultConfig();
        ConfigLoader.configLoad();

        Bukkit.getPluginManager().registerEvents(new OreMiningListener(),this);
        Bukkit.getPluginManager().registerEvents(new FishingListener(),this);
        Bukkit.getPluginManager().registerEvents(new HarvestListener(),this);
        Objects.requireNonNull(Bukkit.getPluginCommand("spicyexperience"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
