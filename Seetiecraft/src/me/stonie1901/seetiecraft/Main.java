package me.stonie1901.seetiecraft;

import java.io.PrintStream;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class Main extends JavaPlugin
{
  public static Economy economy = null;

  public void onDisable()
  {
    System.out.println(ChatColor.RED + "Das Plugin Seetiecraft wurde Deaktiviert!");
    getServer().getScheduler().cancelTasks(this);
  }

  public void onEnable()
  {
    setupEconomy();
    FileConfiguration config = getConfig();
    config.addDefault("Seetiecraft.Votelistener", Boolean.valueOf(false));
    config.addDefault("Seetiecraft.PVP", Boolean.valueOf(true));
    config.addDefault("Seetiecraft.GM", Boolean.valueOf(true));
    config.addDefault("Seetiecraft.Nachrichten", Boolean.valueOf(false));
    config.addDefault("Preis.Eisen", "550");
    config.addDefault("Wetter.Warnung", Boolean.valueOf(true));
    config.addDefault("Preis.Diamant", "7500");
    config.addDefault("Nachrichten", new String[] { 
      "§4Dies ist eine Testnachricht", 
      "§6Plugin erstellt von stonie1901", 
      "§4Loesche sie falls noetig aus der config.yml von Seetiecraft." });

    getConfig().options().copyDefaults(true);
    saveConfig();

    System.out.println("Das Plugin Seetiecraft wurde Aktiviert");
    getCommand("hallo").setExecutor(new HalloCommand());
    getCommand("vip").setExecutor(new VipCommand());
    getCommand("spieler").setExecutor(new KoordinatenCommand());

    getCommand("seetinfo").setExecutor(new SeetinfoCommand());
    getCommand("youtuber").setExecutor(new YoutuberCommand());
    getCommand("vote").setExecutor(new VoteCommand());
    getCommand("buy").setExecutor(new RuessiCommand(this));
    getCommand("survival").setExecutor(new GmCommand());
    getCommand("heilen").setExecutor(new HealCommand(this));
    getCommand("teamspeak").setExecutor(new TeamspeakCommand());
    getCommand("facebook").setExecutor(new FacebookCommand());

    if (config.getBoolean("Seetiecraft.GM")) {
      getCommand("survival").setExecutor(new GmCommand());
    }
    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new JoinListener(), this);

    if (config.getBoolean("Seetiecraft.Votelistener")) {
      pm.registerEvents(new VoteListener(), this);
    }

    if (config.getBoolean("Seetiecraft.PVP"))
      pm.registerEvents(new DamageListener(), this);
  }

  private boolean setupEconomy()
  {
    RegisteredServiceProvider economyProvider = getServer().getServicesManager().getRegistration(Economy.class);
    if (economyProvider != null) {
      economy = (Economy)economyProvider.getProvider();
    }
    return economy != null;
  }
}