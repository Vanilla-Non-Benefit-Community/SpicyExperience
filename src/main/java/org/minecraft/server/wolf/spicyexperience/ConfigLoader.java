package org.minecraft.server.wolf.spicyexperience;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

public class ConfigLoader {
    public static FileConfiguration config;
    public static List<String> blackListBlock = new ArrayList<>();

    public static double oreExpMultiple;
    public static double fishExpMultiple;
    public static double harvestChance;
    public static int harvestExp;
    public static void configLoad()
    {
        //重载一次
        SpicyExperience.instance.reloadConfig();
        //读取配置
        config = SpicyExperience.instance.getConfig();

        oreExpMultiple = config.getDouble("BlockExpEvent.Multiple",2.0);
        fishExpMultiple = config.getDouble("PlayerFishEvent.Multiple",2.0);

        blackListBlock = config.getStringList("BlockExpEvent.BlackListBlock");

        harvestChance = config.getDouble("BlockDropItemEvent.Chance",20.0);
        harvestExp = config.getInt("BlockDropItemEvent.Exp",1);
    }
}
