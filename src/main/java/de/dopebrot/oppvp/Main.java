package de.dopebrot.oppvp;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Main extends JavaPlugin {

    public HashMap<Player, Location> playerDeathLocation = new HashMap<>();
    public HashMap<Player, Long> playerCombatTime = new HashMap<>();

    public final String plugin_Prefix = "§c[OPPVP] >§r";
    public final String senderNotPlayer = plugin_Prefix + " Befehl kann nur als Spieler ausgeführt werden.";


    @Override
    public void onEnable() {
        System.out.println("Plugin gestartet.");






    }

    @Override
    public void onDisable() {
        System.out.println("Plugin gestoppt.");

    }

}
