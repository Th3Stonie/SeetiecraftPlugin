package me.stonie1901.seetiecraft;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    Player p = (Player)cs;
    if (p.hasPermission("Seetiecraft.gm")) {
      if (Label.equalsIgnoreCase("survival")) {
        if (p.getGameMode() == GameMode.SURVIVAL) {
          cs.sendMessage("§b[§2Seetiecraft.de§b]§r §cDu hast schon Survivalmode!");
          return true;
        }
        p.setGameMode(GameMode.SURVIVAL);
        p.sendMessage("§b[§2Seetiecraft.de§b]§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
        return true;
      }

      if (Label.equalsIgnoreCase("creative")) {
        if (p.getGameMode() == GameMode.CREATIVE) {
          cs.sendMessage("§b[§2Seetiecraft.de§b]§r §cDu hast schon Creativmode!");
          return true;
        }
        p.setGameMode(GameMode.CREATIVE);
        p.sendMessage("§b[§2Seetiecraft.de§b]§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
        return true;
      }

      if (Label.equalsIgnoreCase("adventure")) {
        if (p.getGameMode() == GameMode.ADVENTURE) {
          cs.sendMessage("§b[§2Seetiecraft.de§b]§r §cDu hast schon Adventuremode!");
          return true;
        }
        p.setGameMode(GameMode.ADVENTURE);
        p.sendMessage("§b[§2Seetiecraft.de§b]§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
        return true;
      }
    }

    p.sendMessage("§b[§2Seetiecraft.de§b]§r §cDu bist keine Rechte für §6Seetiecraft.gm");
    return true;
  }
}