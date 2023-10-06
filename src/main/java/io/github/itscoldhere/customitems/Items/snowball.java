package io.github.itscoldhere.customitems.Items;

import io.github.itscoldhere.customitems.Util.ItemUtil;
import io.github.itscoldhere.customitems.Util.RegisteryUtil;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class snowball implements ItemUtil {
    @Override
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        player.launchProjectile(Snowball.class, player.getLocation().getDirection().multiply(2));
    }

    @Override
    public void onLeftClick(PlayerInteractEvent event) {

    }

    @Override
    public @NotNull ItemStack getItemStack() {
        RegisteryUtil util = new RegisteryUtil(Material.STICK, "Snownall Launcher", "snowball", "Just Another Snowball launcher", "Right click to shoot a snowball");
        util.addEnchant(Enchantment.KNOCKBACK, 30);
        return util.getItemStack();
    }

    @Override
    public @NotNull List<String> getLore() {
        return this.getItemStack().getItemMeta().getLore();
    }
}
