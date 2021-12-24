package org.minecraft.server.wolf.spicyexperience;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

public class HarvestListener implements Listener {
    @EventHandler
    public static void harvest(BlockDropItemEvent e)
    {
        if(e.getBlockState().getData().toString().endsWith("(7)"))
        {
            if(Math.random()*100 < ConfigLoader.harvestChance)
            {
                e.getPlayer().giveExp(ConfigLoader.harvestExp);
            }
        }
    }
}
