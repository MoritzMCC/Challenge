package de.MoritzMCC.challenge;

import de.MoritzMCC.challenges.AbstractChallenge;
import de.MoritzMCC.commands.ChallengeCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    Plugin instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
       instance = this;
       registerCommands();
       registerListeners();
    }

    private void registerCommands() {
        getCommand("challenge").setExecutor(new ChallengeCommand());
    }

    private void registerListeners() {
         PluginManager pluginManager = getServer().getPluginManager();
         pluginManager.registerEvents(new AbstractChallenge(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public Plugin getInstance() {
        return instance;
    }
}
