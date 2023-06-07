package io.github.itscoldhere.customitems.Util;

import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ItemUtil {
     void onRightClick(PlayerInteractEvent var1);
     void onLeftClick(PlayerInteractEvent var1);
     @NotNull
     ItemStack getItemStack();
     @NotNull
     List<String> getLore();
}
