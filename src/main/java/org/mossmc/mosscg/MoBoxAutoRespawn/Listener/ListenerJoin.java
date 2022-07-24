package org.mossmc.mosscg.MoBoxAutoRespawn.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ListenerJoin implements Listener {
    @EventHandler
    public static void onDeath(PlayerJoinEvent event) {
        if (event.getPlayer().isDead()) {
            event.getPlayer().spigot().respawn();
        }
    }
}
