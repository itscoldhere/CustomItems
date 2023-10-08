package io.github.itscoldhere.customitems.Items;

import io.github.itscoldhere.customitems.Util.ItemUtil;
import io.github.itscoldhere.customitems.Util.RegisteryUtil;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CrimsonBlade implements ItemUtil {
    @Override
    public void onRightClick(PlayerInteractEvent var1) {
        Player player = var1.getPlayer();
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1));
    }

    @Override
    public void onLeftClick(PlayerInteractEvent var1) {}

    @Override
    public @NotNull ItemStack getItemStack() {
        RegisteryUtil util = new RegisteryUtil(Material.NETHERITE_SWORD, "Crimson Blade", "crimsonblade", "A blade forged from the materials in the deepest depths of this world","The Blade is honed with the purest sharpeners" , "On right click the blade will give you a speed potion");
        util.setCustomModelData(42);
        util.addEnchant(Enchantment.DAMAGE_ALL, 8);
        util.addEnchant(Enchantment.FIRE_ASPECT, 3);
        util.addEnchant(Enchantment.SWEEPING_EDGE, 4);
        ItemStack stack = util.getItemStack();
        ItemMeta meta = stack.getItemMeta();
        meta.setUnbreakable(true);
        stack.setItemMeta(meta);
        return stack;
    }

    @Override
    public @NotNull List<String> getLore() {
        return this.getItemStack().getLore();
    }
}
