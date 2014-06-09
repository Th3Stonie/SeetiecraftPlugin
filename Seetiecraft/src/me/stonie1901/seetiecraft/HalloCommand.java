package me.stonie1901.seetiecraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HalloCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String args, String[] arg3)
  {
    if ((cs instanceof Player)) {
      Player player = (Player)cs;

      player.sendMessage(ChatColor.GREEN + "[Seetiecraft.de] " + ChatColor.GOLD + "HALLO :)");
      return true;
    }
    return true;
  }
}