package br.vernacci.vmod;

import br.vernacci.vmod.commands.Fly;
import br.vernacci.vmod.handlers.PlayerHandler;
import br.vernacci.vmod.handlers.TorchHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vmod extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Servidor babadi.");
        getCommand("fly").setExecutor(new Fly());
        new TorchHandler(this);
        new PlayerHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Servidor desligando.");
    }
}
