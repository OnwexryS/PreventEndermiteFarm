package com.minerival.development;

import org.bukkit.entity.Endermite;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PreventEndermiteFarm extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().broadcastMessage("Endermites won't attack endermans anymore");
    }

    @EventHandler
    public void disableEndermiteSpawns(CreatureSpawnEvent spawningEntity){
        if (spawningEntity.getEntityType() == EntityType.ENDERMITE){
            Endermite e = (Endermite) spawningEntity.getEntity();
            e.setPlayerSpawned(false);

        }
    }
}
