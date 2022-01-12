package de.dopebrot.oppvp.command;

import de.dopebrot.oppvp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandClearInventory implements CommandExecutor {

    private Main plugin;
    public CommandClearInventory(Main plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player p = ((Player) sender).getPlayer();
            switch (args.length) {
                case 1:
                    break;
                default:
                    break;
            }
        }else System.out.println(plugin.senderNotPlayer);

        return false;
    }

}
