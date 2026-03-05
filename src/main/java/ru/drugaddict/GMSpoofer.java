package ru.drugaddict;

import org.bukkit.plugin.java.JavaPlugin;
import ru.drugaddict.command.GamemodeCommand;

public final class GMSpoofer extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("GMSpoofer has been enabled!");

        getCommand("gm").setExecutor(new GamemodeCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("GMSpoofer has been disabled!");

    }
}
