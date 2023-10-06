package io.github.itscoldhere.customitems.Util;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class RegisteryUtil {
    private ItemStack stack;
    public RegisteryUtil(Material mt){
        stack = new ItemStack(mt);
        ItemMeta stackmeta = stack.getItemMeta();
        stackmeta.setCustomModelData(42);
        stack.setItemMeta(stackmeta);
    }
    public RegisteryUtil(Material mt, String Name, @NotNull String name){
        NamespacedKey key = new NamespacedKey("custom", name);
        stack = new ItemStack(mt);
        ItemMeta stackmeta = stack.getItemMeta();
        PersistentDataContainer data = stackmeta.getPersistentDataContainer();
        Integer dat = data.get(key, PersistentDataType.INTEGER);
        data.set(key, PersistentDataType.INTEGER, 1);
        stackmeta.setCustomModelData(42);
        stackmeta.setDisplayName(Name);
        stack.setItemMeta(stackmeta);
    }
    public RegisteryUtil(Material mt, String Name,@NotNull String name, String ... Lore){
        NamespacedKey key = new NamespacedKey("custom", name);
        stack = new ItemStack(mt);
        ItemMeta stackmeta = stack.getItemMeta();
        PersistentDataContainer data = stackmeta.getPersistentDataContainer();
        Integer dat = data.get(key, PersistentDataType.INTEGER);
        data.set(key, PersistentDataType.INTEGER, 1);
        stackmeta.setDisplayName(Name);
        stackmeta.setCustomModelData(42);
        stackmeta.setLore(Arrays.asList(Lore));
        stack.setItemMeta(stackmeta);
    }
    public void AddLoreLine(String Lore){
        ItemMeta stackmeta = stack.getItemMeta();
        List lore = stackmeta.getLore();
        lore.add(Lore);
        stackmeta.setLore(lore);
        stack.setItemMeta(stackmeta);
    }
    public void addEnchant(Enchantment ench, @Nullable int potency){
        ItemMeta stackmeta = stack.getItemMeta();
        if(potency>=1){stack.addUnsafeEnchantment(ench, potency);}
        else{stack.addUnsafeEnchantment(ench, 1);}

    }

    public void setCustomModelData(int i){
        ItemMeta meta = stack.getItemMeta();
        meta.setCustomModelData(i);
        stack.setItemMeta(meta);
    }
    public void SetItemStack(ItemStack otherstack){stack = otherstack;}
    public ItemStack getItemStack(){
        return stack;
    }
}
