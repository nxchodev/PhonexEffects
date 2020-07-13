package me.nacho.effects.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.nacho.effects.colors.Colors;

public class FireResCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(Colors.translate("&4No pelotudo"));
			return true;
		}
		Player player = (Player) sender;
		if(!player.hasPermission("phonexeffects.fireres") || !player.isOp()) {
			sender.sendMessage(Colors.translate("&cNo Permission."));
			return true;
		}
		if(!player.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,Integer.MAX_VALUE, 1));
			sender.sendMessage(Colors.translate("&aGiven you &6&lFire Resistance Effect"));
			player.playSound(player.getLocation(), Sound.DRINK, 10, 1);
		} else {
			player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
			sender.sendMessage(Colors.translate("&cRemoved from you &6&lFire Resistance Effect"));
			player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 10, 1);
		}
		return true;
	}

}
