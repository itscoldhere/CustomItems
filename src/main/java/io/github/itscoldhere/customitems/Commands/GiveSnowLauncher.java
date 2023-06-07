package io.github.itscoldhere.customitems.Commands;

import io.github.itscoldhere.customitems.Items.snowball;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveSnowLauncher implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            snowball sas = new snowball();
            ItemStack stack = sas.getItemStack();
            player.getInventory().addItem(stack);
            return true;
        }
        return false;
    }
}