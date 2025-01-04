package de.MoritzMCC.challenges.someChallenges;

import de.MoritzMCC.challenges.AbstractChallenge;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.checkerframework.checker.units.qual.A;

public class NoSneakChallenge extends AbstractChallenge {


    public NoSneakChallenge() {
        super("NoSneak", "You are not allowed to sneak");
    }

    @Override
    public void onSneak(PlayerToggleSneakEvent event ) {
        event.setCancelled(true);
    }
}
