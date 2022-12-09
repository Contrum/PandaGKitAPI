package dev.panda.gkit.commons.customenchant;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

public class CustomEnchantManager {

    public void registerCustomEnchant(ICustomEnchant customEnchant) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    void registerEnchant(ICustomEnchant customEnchant) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public ICustomEnchant getByName(String name) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public ICustomEnchant getByItem(ItemStack item) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public List<ICustomEnchant> getByArmorItem(ItemStack item) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public List<ICustomEnchant> getCustomEnchants() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void load() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }
}
