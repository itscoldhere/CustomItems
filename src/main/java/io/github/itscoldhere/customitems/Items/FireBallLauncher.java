package io.github.itscoldhere.customitems.Items;

import io.github.itscoldhere.customitems.Util.ItemUtil;
import io.github.itscoldhere.customitems.Util.RegisteryUtil;
import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FireBallLauncher implements ItemUtil {
    @Override
    public void onRightClick(PlayerInteractEvent var1) {
        Player player = var1.getPlayer();
        player.launchProjectile(Fireball.class, player.getLocation().getDirection());
    }

    @Override
    public void onLeftClick(PlayerInteractEvent var1) {}

    @Override
    public @NotNull ItemStack getItemStack() {
        RegisteryUtil Util = new RegisteryUtil(Material.STICK, "FireBall Launcher", "fireballlauncher", "A powerful tool that let's you become a being of fire", "With this tool you can shoot fireballs", "Right click to shoot fireballs");
        Util.setCustomModelData(44);
        return Util.getItemStack();
    }

    @Override
    public @NotNull List<String> getLore() {
        return this.getItemStack().getItemMeta().getLore();
    }
}
