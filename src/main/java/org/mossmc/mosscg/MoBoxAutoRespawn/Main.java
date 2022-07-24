package org.mossmc.mosscg.MoBoxAutoRespawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.mossmc.mosscg.MoBoxAutoRespawn.Listener.ListenerDeath;
import org.mossmc.mosscg.MoBoxAutoRespawn.Listener.ListenerJoin;
import org.mossmc.mosscg.MoBoxAutoRespawn.Listener.ListenerQuit;
import org.mossmc.mosscg.MoBoxCore.Info.InfoGroupBackend;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    public static Logger logger;

    @Override
    public void onLoad() {
        logger = getLogger();
    }

    @Override
    public void onEnable() {
        InfoGroupBackend.sendPluginStartGroup(BasicInfo.pluginName, BasicInfo.pluginVersion);
        logger.info(ChatColor.GREEN+"正在注册事件监听器");
        Bukkit.getPluginManager().registerEvents(new ListenerDeath(),this);
        Bukkit.getPluginManager().registerEvents(new ListenerJoin(),this);
        Bukkit.getPluginManager().registerEvents(new ListenerQuit(),this);
        logger.info(ChatColor.GREEN+"事件监听器注册完成");
    }
}
