package io.github.itscoldhere.customitems.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static io.github.itscoldhere.customitems.CustomItems.SnowBall;

public class EnableSnowBall implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SnowBall = !(SnowBall);
        return true;
    }
}
