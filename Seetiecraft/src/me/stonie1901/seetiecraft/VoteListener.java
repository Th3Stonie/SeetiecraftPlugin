package me.stonie1901.seetiecraft;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;
import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class VoteListener
  implements Listener
{
  private File file = new File("plugins/Seetiecraft", "votes.yml");
  private FileConfiguration cfg = YamlConfiguration.loadConfiguration(this.file);

  @EventHandler
  public void onVote(VotifierEvent e)
  {
    Vote vote = e.getVote();
    String username = vote.getUsername();
    boolean known = false;
    if (username.length() <= 16) {
      Player p = Bukkit.getPlayer(username);
      if (p != null) {
        p.setLevel(p.getLevel() + 2);
        p.sendMessage("§7[§6Seetiecraft.de§7]§r §5Danke fürs Voten, hier hast du 2 Level");
      } else {
        OfflinePlayer op = Bukkit.getOfflinePlayer(username);
        if (op != null) {
          known = true;
          this.cfg.set(op.getName(), Integer.valueOf(this.cfg.getInt(op.getName()) + 2));
          try {
            this.cfg.save(this.file);
          } catch (IOException e1) {
            e1.printStackTrace();
          }
        }
      }
    }
    if (known)
      Bukkit.broadcastMessage("§7[§6Seetiecraft.de§7]§r §5" + username + " hat für uns gevotet.");
    else
      Bukkit.broadcastMessage("§7[§6Seetiecraft.de§7]§r §5Ein unbekannter Spieler hat für uns gevotet.");
  }

  @EventHandler
  public void onJoin(PlayerJoinEvent e)
  {
    Player p = e.getPlayer();
    String name = p.getName();
    if (this.cfg.contains(name)) {
      p.setLevel(p.getLevel() + this.cfg.getInt(name));
      this.cfg.set(name, null);
      try {
        this.cfg.save(this.file);
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    }
  }
}