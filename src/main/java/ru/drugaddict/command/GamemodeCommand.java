package ru.drugaddict.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player p)) {
            sender.sendMessage(ChatColor.RED + "Команда только для игроков");
            return true;
        }

        if (args.length == 0) {
            p.sendMessage(ChatColor.GOLD + "Используй /gmspoofer <0|1|3>");
            return true;
        }

        GamemodeType type = GamemodeType.byId(args[0]);

        if (type == null) {
            p.sendMessage(ChatColor.RED + "Неверный gamemode");
            return true;
        }

        p.setGameMode(type.getGamemode());
        p.sendMessage(ChatColor.GOLD+"Ваш режим изменён на " + type.getGamemode());

        return true;
    }
}