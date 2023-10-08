package io.github.itscoldhere.customitems.Items;

import io.github.itscoldhere.customitems.Util.ItemUtil;
import io.github.itscoldhere.customitems.Util.RegisteryUtil;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AOTE implements ItemUtil {
    @Override
    public void onRightClick(PlayerInteractEvent var1) {
        Player player = var1.getPlayer();
        if (player.getTargetBlock(10) != null) {
            BlockFace bf = player.getTargetBlockFace(10);
            Vector vec = player.getLocation().getDirection();
            Location location = player.getTargetBlock(10).getLocation().add(bf.getDirection());
            if (location.getWorld().getBlockAt(location.add(0, 1, 0)).isEmpty()) {
                location.setDirection(vec);
                player.teleport(location.add(new Vector(0.5, -1, 0.5)));
            } else {
                player.teleport(player.getLocation().add(0, 1, 0));
                bf = player.getTargetBlockFace(10);
                location = player.getTargetBlock(10).getLocation().add(bf.getDirection());
                location.setDirection(vec);
                player.teleport(location.add(new Vector(0.5, 0, 0.5)));
            }
        } else {
            Location loc = player.getLocation();
            Vector dir = loc.getDirection();
            dir.normalize();
            dir.multiply(10);
            loc.add(dir);
            if (!loc.getWorld().getBlockAt(loc).isEmpty()) {
                loc.add(0,1,0);
            }
            player.teleport(loc);
        }
    }

    @Override
    public void onLeftClick(PlayerInteractEvent var1) {}

    @Override
    public @NotNull ItemStack getItemStack() {
        RegisteryUtil util = new RegisteryUtil(Material.STICK, "Aspect Of The End", "aote", "A wand forged from the deepest materials in the end", "the wand let's you teleport 10 blocks forward", "Right click to teleport");
        util.setCustomModelData(45);
        return util.getItemStack();
    }

    @Override
    public @NotNull List<String> getLore() {
        return this.getItemStack().getLore();
    }
}
