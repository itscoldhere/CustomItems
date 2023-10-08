package io.github.itscoldhere.customitems.Commands;

import io.github.itscoldhere.customitems.Items.AOTE;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveAOTE implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            player.getInventory().addItem(new AOTE().getItemStack());
            return true;
        }
        return false;
    }
}
