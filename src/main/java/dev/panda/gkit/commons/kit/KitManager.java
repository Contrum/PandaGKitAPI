package dev.panda.gkit.commons.kit;

import com.google.common.collect.Table;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Map;
import java.util.UUID;

public class KitManager {


    public void create(String kitName) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void delete(String kitName) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void deleteAll() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public Kit getByName(String name) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public Map<String, Kit> getKits() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public Table<UUID, Kit, Integer> getKitUses() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void load() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

}
