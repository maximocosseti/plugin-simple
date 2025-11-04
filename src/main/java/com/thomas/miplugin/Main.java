package com.thomas.miplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.EventHandler;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("MiPrimerPlugin activado!");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("hola").setExecutor(new ComandoHola());
    }

    @Override
    public void onDisable() {
        getLogger().info("MiPrimerPlugin desactivado!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("¡Bienvenido al servidor!");
    }
}
