package me.stonie1901.seetiecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YoutuberCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    Player player = (Player)cs;

    player.sendMessage("§6Dies sind unsere Youtber::");
    player.sendMessage(" ");
    player.sendMessage("§cGagamehlLP (Gagamehl0798) und");
    player.sendMessage("§cHübiLP (Mineman_1234)");
    player.sendMessage("");
    player.sendMessage("§6Werde auch du ein teil der Youtuber und melde dich, falls du einer Werden willst bei den Ownern oder den Youtuber.");
    return true;
  }
}