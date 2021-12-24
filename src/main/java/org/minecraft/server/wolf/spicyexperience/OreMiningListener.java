package org.minecraft.server.wolf.spicyexperience;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExpEvent;

public class OreMiningListener implements Listener {
    @EventHandler
    public void oreMining(BlockExpEvent e)
    {
        if(e.getExpToDrop() != 0)
        if(!ConfigLoader.blackListBlock.contains(e.getBlock().getType().toString().toLowerCase()))
        {
            int EXP = e.getExpToDrop();
            int finalEXP = EXP * (int)ConfigLoader.oreExpMultiple;
            e.setExpToDrop(finalEXP);
        }
    }
}
