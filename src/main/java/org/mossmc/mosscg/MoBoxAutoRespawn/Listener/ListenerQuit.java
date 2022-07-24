package org.mossmc.mosscg.MoBoxAutoRespawn.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ListenerQuit implements Listener {
    @EventHandler
    public static void onDeath(PlayerQuitEvent event) {
        if (event.getPlayer().isDead()) {
            event.getPlayer().spigot().respawn();
        }
    }
}
