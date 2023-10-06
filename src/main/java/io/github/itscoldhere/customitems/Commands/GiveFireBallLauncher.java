package io.github.itscoldhere.customitems.Commands;

import io.github.itscoldhere.customitems.Items.FireBallLauncher;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveFireBallLauncher implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            FireBallLauncher fr = new FireBallLauncher();
            player.getInventory().addItem(fr.getItemStack());
            return true;
        }
        return false;
    }
}
