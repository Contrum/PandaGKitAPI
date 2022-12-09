package dev.panda.gkit.commons.customenchant;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.bukkit.potion.PotionEffectType;

public abstract class ICustomEnchant implements Listener {

    public ICustomEnchant(String name, CustomEnchantProperties defaultProperties, PotionEffectType... effects) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public ICustomEnchant(String name, CustomEnchantProperties defaultProperties) {
        this(name, defaultProperties, new PotionEffectType[] {});
    }

    public ItemStack getItem() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public ItemStack getItem(int amount) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void give(Player player, int amount) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void giveAll(int amount) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void apply(ItemStack itemStack) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void onMove(Player player) { }

    public void onKill(Player player, Player killer) { }

    public double onHit(Player player, Player damager, double damage) {
        return damage;
    }

    public String getName() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public CustomEnchantProperties getProperties() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public PotionEffectType[] getEffects() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }
}
