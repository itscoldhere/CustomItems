package io.github.itscoldhere.customitems.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AnnoythemEXE implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 0 && commandSender instanceof Player) {
            ((Player) commandSender).showDemoScreen();
        } else if (strings.length > 0) {
            if (Bukkit.getPlayer(strings[0]) != null) {
                Bukkit.getPlayer(strings[0]).showDemoScreen();
            } else {
                ((Player) commandSender).sendMessage(ChatColor.RED + "Not A player \n Please don't be stupid");
            }
        }
        return false;
    }
}
