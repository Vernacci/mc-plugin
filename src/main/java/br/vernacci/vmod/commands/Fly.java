package br.vernacci.vmod.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("only players can run this");
            return true;
        }
        Player player = (Player) sender;
        if (player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage("flying disabled");
        } else {
            player.setAllowFlight(true);
            player.sendMessage("flying enabled");
        }
        return true;
    }
}
