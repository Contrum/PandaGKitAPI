package dev.panda.gkit.utilities.file;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;

public class FileConfig {

    public FileConfig(JavaPlugin plugin, String fileName) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public double getDouble(String path) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public int getInt(String path) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public boolean getBoolean(String path) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public long getLong(String path){
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public String getString(String path) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public String getString(String path, String callback, boolean colorize) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public List<String> getReversedStringList(String path) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public List<String> getStringList(String path) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public List<String> getStringListOrDefault(String path, List<String> toReturn) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void save() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void reload() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public File getFile() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public FileConfiguration getConfiguration() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public boolean isNewFile() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }
}