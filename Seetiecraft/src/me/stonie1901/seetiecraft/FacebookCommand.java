package me.stonie1901.seetiecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FacebookCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    Player p = (Player)cs;
    if ((cs instanceof Player)) {
      p.sendMessage("§6Like uns doch auf Facebook");
      p.sendMessage("");
      p.sendMessage("Die Adresse ist:");
      p.sendMessage("");
      p.sendMessage("§ahttp://goo.gl/rTTBA");
    }
    return true;
  }
}