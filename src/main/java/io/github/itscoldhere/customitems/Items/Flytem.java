package io.github.itscoldhere.customitems.Items;

import io.github.itscoldhere.customitems.Util.ItemUtil;
import io.github.itscoldhere.customitems.Util.RegisteryUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Flytem implements ItemUtil {
    @Override
    public void onRightClick(PlayerInteractEvent var1) {
        Player player = var1.getPlayer();
        player.setAllowFlight(!player.getAllowFlight());
        player.setFlying(false);
    }

    @Override
    public void onLeftClick(PlayerInteractEvent var1) {}

    @Override
    public @NotNull ItemStack getItemStack() {
        RegisteryUtil stack = new RegisteryUtil(Material.DIAMOND, "Flytem", "flytem", "A powerful tool that lets the user fly on command", "Right click to fly");
        return stack.GetItemStack();
    }

    @Override
    public @NotNull List<String> getLore() {
        return this.getItemStack().getItemMeta().getLore();
    }
}