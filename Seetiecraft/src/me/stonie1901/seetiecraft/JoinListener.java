package me.stonie1901.seetiecraft;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinListener
  implements Listener
{
  @EventHandler
  public void onJoin(PlayerJoinEvent e)
  {
    Player p = e.getPlayer();
    if (p.isOp())
      e.setJoinMessage("§bDer Owner §4" + p.getName() + " §bist wieder am Start!");
    else
      e.setJoinMessage("§8+ " + p.getName());
  }

  @EventHandler
  public void OnQuit(PlayerQuitEvent e)
  {
    Player p = e.getPlayer();
    if (p.isOp())
      e.setQuitMessage("§bDer Owner §4" + p.getName() + " §bhat uns verlassen!");
    else
      e.setQuitMessage("§8- " + p.getName());
  }
}