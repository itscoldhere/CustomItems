package io.github.itscoldhere.customitems;

import io.github.itscoldhere.customitems.Commands.EnableSnowBall;
import io.github.itscoldhere.customitems.Commands.GiveFlytem;
import io.github.itscoldhere.customitems.Commands.GiveSnowLauncher;
import io.github.itscoldhere.customitems.Handlers.PlayerHandler;
import io.github.itscoldhere.customitems.Items.RegisterItems;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomItems extends JavaPlugin {
    public static Boolean SnowBall = false;
    @Override
    public void onEnable() {

        new PlayerHandler(this);
        RegisterItems.registerItems();
        this.getCommand("snowball").setExecutor(new GiveSnowLauncher());
        this.getCommand("enablesnowball").setExecutor(new EnableSnowBall());
        this.getCommand("flytem").setExecutor(new GiveFlytem());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
