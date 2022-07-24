package org.mossmc.mosscg.MoBoxAutoRespawn.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ListenerDeath implements Listener {
    @EventHandler
    public static void onDeath(PlayerDeathEvent event) {
        event.getEntity().spigot().respawn();
    }
}
