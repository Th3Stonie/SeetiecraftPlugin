package me.stonie1901.seetiecraft;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class RuessiCommand
  implements CommandExecutor
{
  private Economy econ;

  public RuessiCommand(Main plugin)
  {
    this.econ = Main.economy;
  }

  public boolean onCommand(CommandSender cs, Command cmd, String Label, String[] args)
  {
    Player p = (Player)cs;
    PlayerInventory pi = p.getInventory();
    if (Label.equalsIgnoreCase("dia")) {
      if (pi.firstEmpty() == -1) {
        cs.sendMessage("§cDein Inventar ist voll!");
        return true;
      }
      if (this.econ.has(p.getName(), 7500.0D));
      this.econ.withdrawPlayer(p.getName(), 7500.0D);
      pi.addItem(new ItemStack[] { new ItemStack(310, 1) });
      pi.addItem(new ItemStack[] { new ItemStack(311, 1) });
      pi.addItem(new ItemStack[] { new ItemStack(312, 1) });
      pi.addItem(new ItemStack[] { new ItemStack(313, 1) });
      p.sendMessage("§b[§2Seetiecraft.de§b]§r §6Da hast du deine Diarüssi;)");
      p.sendMessage("§6Es wurden dir §c7500 " + this.econ.currencyNamePlural() + " §6abgezogen!");

      return true;
    }

    if (Label.equalsIgnoreCase("eisen")) {
      if (pi.firstEmpty() == -1) {
        cs.sendMessage("§cDein Inventar ist voll!");
        return true;
      }
      if (this.econ.has(p.getName(), 550.0D));
      this.econ.withdrawPlayer(p.getName(), 550.0D);
      pi.addItem(new ItemStack[] { new ItemStack(306, 1) });
      pi.addItem(new ItemStack[] { new ItemStack(307, 1) });
      pi.addItem(new ItemStack[] { new ItemStack(308, 1) });
      pi.addItem(new ItemStack[] { new ItemStack(309, 1) });
      p.sendMessage("§b[§2Seetiecraft.de§b]§r §6Da hast du deine Eisenrüssi;)");
      p.sendMessage("§6Es wurden dir §c550 " + this.econ.currencyNamePlural() + " §6abgezogen!");

      return true;
    }

    return true;
  }
}