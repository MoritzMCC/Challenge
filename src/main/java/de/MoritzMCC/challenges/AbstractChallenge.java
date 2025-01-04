package de.MoritzMCC.challenges;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.units.qual.A;

public class AbstractChallenge implements Listener {

    protected String name;
    protected String description;
    protected Boolean isEnabled = false;

    public AbstractChallenge(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public AbstractChallenge(String name) {
        this(name,"");
    }
    public AbstractChallenge() {
        this("name");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public void onSneak(PlayerToggleSneakEvent event){

    }
    @EventHandler
    public void Sneak(PlayerToggleSneakEvent event){
        Player player = event.getPlayer();
        if (player.isSneaking()){
            onSneak(event);
        }
    }

}
