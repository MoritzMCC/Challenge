package de.MoritzMCC.util;

import de.MoritzMCC.challenge.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

public class AbstractCommand implements CommandExecutor {


    public void createCommand(CommandSender sender, Command cmd, String label, String[] args) {
        onCommand(sender, cmd, label, args);

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }

    public Boolean isPlayer(CommandSender sender) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command.");
            return false;
        }
        return true;
    }

    public Boolean hasPermission(CommandSender sender, String permission) {
        if(sender.hasPermission(permission)) {
            return true;
        }
        sender.sendMessage("You don't have permission to use this command.");
        return false;
    }

    public Boolean hasOpenInventory(Player player) {
        return (player.getOpenInventory() == null) ? false : true;
    }




}
