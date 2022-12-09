package dev.panda.gkit;

import dev.panda.gkit.commons.customenchant.ICustomEnchant;
import dev.panda.gkit.commons.kit.Kit;
import lombok.experimental.UtilityClass;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/*
 * Project: PandaGKit
 * Created at: 9/12/22 18:14
 * Created by: Dani-error
 */

@UtilityClass
public class PandaGKitAPI {


    /**
     * This method returns a Kit instance from its name.
     *
     * @param name The Kit's name
     * @return The kit instance
     */
    public Kit getKit(String name) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    /**
     * This method applies a kit to a player.
     *
     * @param player The player which the kit is going to be applied
     * @param kit The kit to be applied
     */
    public void applyKit(Player player, Kit kit) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    /**
     * This method applies a kit to a player without verifying if its
     * have permissions, playtime, uses, cooldown, if the category is
     * enabled or the kit.
     *
     * @param player The player which the kit is going to be applied
     * @param kit The kit to be applied
     */
    public void applyKitForced(Player player, Kit kit) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    /**
     * This method returns a Custom Enchantment instance from its name.
     *
     * @param name The Custom Enchantment's name
     * @return The custom enchant instance
     */
    public ICustomEnchant getCustomEnchantment(String name) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    /**
     *
     * @param player The player which the kit is going to be given the item
     * @param enchant The Custom Enchantment
     * @param amount The amount of items
     */
    public void giveCustomEnchant(Player player, ICustomEnchant enchant, int amount) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    /**
     *
     * @param player The player which the kit is going to be given the item
     * @param enchant The Custom Enchantment
     */
    public void giveCustomEnchant(Player player, ICustomEnchant enchant) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    /**
     * This method allows you to create more custom enchants
     *
     * @param customEnchant A Custom Enchantment instance
     */
    public void registerCustomEnchantment(ICustomEnchant customEnchant) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }
}
