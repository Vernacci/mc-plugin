package br.vernacci.vmod;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vmod extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Servidor ligado.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Servidor desligando.");
    }
}
