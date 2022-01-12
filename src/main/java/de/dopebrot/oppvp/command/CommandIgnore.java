package de.dopebrot.oppvp.command;

import de.dopebrot.oppvp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandIgnore implements CommandExecutor {

    private Main plugin;
    public CommandIgnore(Main plugin) {
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
