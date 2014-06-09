package me.stonie1901.seetiecraft;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand
  implements CommandExecutor
{
  private Economy econ;

  public HealCommand(Main plugin)
  {
    this.econ = Main.economy;
  }

  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    Player p = (Player)cs;
    if ((cs instanceof Player)) {
      if (Label.equalsIgnoreCase("")) {
        cs.sendMessage("§6Dir werden 500 " + this.econ.currencyNamePlural() + " abgezogen");
        cs.sendMessage("Wenn du dir sicher bist, gib \"/heilen ja\" ein!");
      }
    } else if (Label.equalsIgnoreCase("ja")) {
      if (this.econ.has(p.getName(), 500.0D));
      this.econ.withdrawPlayer(p.getName(), 500.0D);
      p.setHealth(20);
      p.setFoodLevel(20);
    }
    else {
      cs.sendMessage("§6Du bist kein Spieler!");
      cs.sendMessage("§6Logge dich ein, damit du");
      cs.sendMessage("§6/heal§6 benutzen kannst!");
    }
    return true;
  }
}