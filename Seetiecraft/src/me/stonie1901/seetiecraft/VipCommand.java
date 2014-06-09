package me.stonie1901.seetiecraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VipCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender cs, Command cmd, String args, String[] arg3)
  {
    Player player = (Player)cs;

    player.sendMessage(ChatColor.GREEN + "Werde VIP: ");
    player.sendMessage(ChatColor.GREEN + " ");
    player.sendMessage(ChatColor.DARK_RED + "Unser Server lebt von Spenden. Durch eine Spende bekommst du bei uns einen besonderen Rang und wirst auch in wichtige Entscheidungen mit einbezogen.");
    player.sendMessage(ChatColor.DARK_RED + " ");
    player.sendMessage(ChatColor.GREEN + "Wenn du Spenden willst, kannst du das per Nitrado oder PaySafeCard. Du sendest einfach den PaySafeCard Code an vip@seetiecraft.de und nach kurzer Zeit wirst du dann, je nachdem wieviel du Spendest, VIP oder Elite");
    return true;
  }
}