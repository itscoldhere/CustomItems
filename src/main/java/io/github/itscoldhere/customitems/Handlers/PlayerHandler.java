package io.github.itscoldhere.customitems.Handlers;

import io.github.itscoldhere.customitems.CustomItems;
import io.github.itscoldhere.customitems.Items.snowball;
import io.github.itscoldhere.customitems.Util.ActualRegistery;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import static io.github.itscoldhere.customitems.CustomItems.SnowBall;

public class PlayerHandler implements Listener {
    public PlayerHandler(CustomItems plugin){Bukkit.getPluginManager().registerEvents(this, plugin);}
    @EventHandler
    public void onClick(@NotNull PlayerInteractEvent e){
        ItemMeta meta = e.getPlayer().getItemInHand().getItemMeta();
        ActualRegistery.Items.forEach((customItem) -> {
            if (customItem.getLore().equals(meta.getLore())){
                if (e.getAction() != Action.LEFT_CLICK_AIR && e.getAction() != Action.LEFT_CLICK_BLOCK) {
                    if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && e.getPlayer().getCooldown(e.getPlayer().getItemInHand().getType()) == 0) {
                        customItem.onRightClick(e);
                        e.getPlayer().setCooldown(e.getPlayer().getItemInHand().getType(), 10);
                    }
                } else {
                    customItem.onLeftClick(e);
                }
            }
        });
    }
    @EventHandler
    public void onPlayerDamage(@NotNull EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player player = (Player) e.getEntity();
            if (SnowBall) {
                snowball sas = new snowball();
                ItemStack stack = sas.getItemStack();
                player.getInventory().addItem(stack);
            }
        }
    }
}