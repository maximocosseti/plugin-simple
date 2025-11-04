package com.thomas.miplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoHola implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            player.sendMessage("¡Hola " + player.getName() + "!");
            return true;
        }
        sender.sendMessage("Este comando solo puede usarse en el juego.");
        return true;
    }
}
