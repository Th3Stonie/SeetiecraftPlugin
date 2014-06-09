package me.stonie1901.seetiecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamspeakCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    Player player = (Player)cs;

    player.sendMessage("§6Dies ist unsere TS-IP:");
    player.sendMessage(" ");
    player.sendMessage("§cSeetiecraft.de:");
    player.sendMessage(" ");
    player.sendMessage("§35.199.142.70:9985");
    return true;
  }
}