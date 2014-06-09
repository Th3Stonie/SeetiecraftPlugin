package me.stonie1901.seetiecraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoteCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String args, String[] arg3)
  {
    Player player = (Player)cs;

    player.sendMessage(ChatColor.GREEN + "SEETIECRAFT.DE: ");
    player.sendMessage(ChatColor.GREEN + "Vote doch unter der Adresse:");
    player.sendMessage(ChatColor.RED + "");
    player.sendMessage(ChatColor.RED + "http://goo.gl/wQG2v");
    player.sendMessage(ChatColor.RED + "oder");
    player.sendMessage(ChatColor.RED + "http://goo.gl/VXirz");
    return true;
  }
}