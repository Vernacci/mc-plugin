package br.vernacci.vmod.handlers;

import br.vernacci.vmod.Vmod;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class TorchHandler implements Listener {
    public TorchHandler(Vmod plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }


    @EventHandler(priority = EventPriority.LOW)
    public void changeTorch(BlockPlaceEvent event) {
        if (event.getBlock().getType() == Material.TORCH) {
            event.setCancelled(true);
        }
    }
    @EventHandler(priority = EventPriority.MONITOR)
    public void onTorchPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if (block.getType() != Material.TORCH) {
        } else {
            Bukkit.getLogger().info("Torch placed");

        }
    }
}
