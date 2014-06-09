package me.stonie1901.seetiecraft;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class KoordinatenCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    cs.sendMessage("§Dies sind die Registrierten Spieler");
    cs.sendMessage("§4" + Bukkit.getOfflinePlayers());

    return false;
  }
}