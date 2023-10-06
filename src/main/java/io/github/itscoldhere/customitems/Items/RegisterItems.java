package io.github.itscoldhere.customitems.Items;

import io.github.itscoldhere.customitems.Util.ActualRegistery;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RegisterItems {
    public static void registerItems() {
        ActualRegistery.register(new snowball());
        ActualRegistery.register(new Flytem());
        ActualRegistery.register(new FireBallLauncher());
        ActualRegistery.register(new CrimsonBlade());
        ActualRegistery.register(new AOTE());
        ShapedRecipe sr = new ShapedRecipe(new NamespacedKey("customitems", "crimsonblade"),new CrimsonBlade().getItemStack());
        sr.shape("BAB", "ASA", "TBT");
        sr.setIngredient('B',new ItemStack(Material.MAGMA_BLOCK));
        sr.setIngredient('S',new ItemStack(Material.NETHERITE_SWORD));
        sr.setIngredient('A',new ItemStack(Material.ANCIENT_DEBRIS));
        sr.setIngredient('T',new ItemStack(Material.TOTEM_OF_UNDYING));
        Bukkit.getServer().addRecipe(sr);
    }
}
