package org.minecraft.server.wolf.spicyexperience;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class FishingListener implements Listener {
    @EventHandler
    public static void fishing(PlayerFishEvent e)
    {
        if(e.getExpToDrop() != 0)
        {
            int EXP = e.getExpToDrop();
            int finalEXP = EXP * (int)ConfigLoader.fishExpMultiple;
            e.setExpToDrop(finalEXP);
        }
    }
}
