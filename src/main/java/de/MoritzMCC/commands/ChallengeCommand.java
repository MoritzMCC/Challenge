package de.MoritzMCC.commands;

import de.MoritzMCC.gui.StandardGUI;
import de.MoritzMCC.util.AbstractCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChallengeCommand extends AbstractCommand {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(isPlayer(commandSender))return false;
       Player player = (Player) commandSender;

       player.openInventory(new StandardGUI().getInventory());
        return false;
    }
}
