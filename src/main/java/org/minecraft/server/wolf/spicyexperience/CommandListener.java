package org.minecraft.server.wolf.spicyexperience;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandListener implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0)
        {
            sender.sendMessage("\u00a77[ \u00a76SpicyExperience \u00a77] \u00a7f缺少必要参数！");
            return true;
        }
        if(args[0].equalsIgnoreCase("help"))
        {
            sender.sendMessage("");
            sender.sendMessage("\u00a77[ \u00a76SpicyExperience \u00a77] \u00a7f帮助 >> ");
            sender.sendMessage("");
            sender.sendMessage("\u00a7f/se help \u00a77- \u00a7f查询帮助");
            sender.sendMessage("\u00a7f/se reload \u00a77- \u00a7f重载配置文件");
            sender.sendMessage("");
            return true;
        }
        if(args[0].equalsIgnoreCase("reload"))
        {
            ConfigLoader.configLoad();
            sender.sendMessage("\u00a77[ \u00a76SpicyExperience \u00a77] \u00a7f重载成功");
            return true;
        }
        return true;
    }
}
