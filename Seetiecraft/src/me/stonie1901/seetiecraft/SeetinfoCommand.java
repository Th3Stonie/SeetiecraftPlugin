package me.stonie1901.seetiecraft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SeetinfoCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String args, String[] arg3)
  {
    Player player = (Player)cs;

    player.sendMessage(ChatColor.GREEN + "§n" + Bukkit.getServerName() + ": §r");
    player.sendMessage(ChatColor.GREEN + " ");
    player.sendMessage("§e§nServerip:§r§e " + Bukkit.getIp() + ":" + Bukkit.getPort());
    player.sendMessage(ChatColor.DARK_RED + " ");
    player.sendMessage(ChatColor.GREEN + "Seetiecraft.de Server Plugin");
    player.sendMessage(ChatColor.GREEN + "Für die Bukkktversion");
    player.sendMessage(ChatColor.GREEN + Bukkit.getVersion());
    player.sendMessage("§c");
    player.sendMessage("§cProgrammiert von stonie1901 für den Seetiecraft.de Gameserver.");
    return true;
  }
}