package dev.panda.gkit.commons.customenchant;

import dev.panda.gkit.utilities.file.FileConfig;
import lombok.NonNull;
import org.bukkit.Material;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.Map;

public class CustomEnchantProperties {

    public CustomEnchantProperties(Map<String, Object> customProperties, FileConfig file, boolean glow, Material material, String displayName, List<String> description, int data, Integer level) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }


    public static CustomEnchantPropertiesBuilder builder() {
        return new CustomEnchantPropertiesBuilder();
    }

    public Object getCustomProperty(String key) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public CustomEnchantProperties(String name, FileConfig file) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public CustomEnchantProperties save(String name, @NonNull FileConfig file) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public Map<String, Object> getCustomProperties() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public FileConfig getFile() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public boolean isGlow() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public Material getMaterial() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public String getDisplayName() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public List<String> getDescription() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public int getData() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public Integer getLevel() {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setCustomProperties(Map<String, Object> customProperties) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setFile(FileConfig file) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setGlow(boolean glow) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setMaterial(Material material) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setDisplayName(String displayName) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setDescription(List<String> description) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setData(int data) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public void setLevel(Integer level) {
        throw new IllegalPluginAccessException("PandaGKit has been not found!");
    }

    public String toString() {
        return "CustomEnchantProperties(customProperties=" + this.getCustomProperties() + ", file=" + this.getFile() + ", glow=" + this.isGlow() + ", material=" + this.getMaterial() + ", displayName=" + this.getDisplayName() + ", description=" + this.getDescription() + ", data=" + this.getData() + ", level=" + this.getLevel() + ")";
    }

    public static class CustomEnchantPropertiesBuilder {


        public CustomEnchantPropertiesBuilder() {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }


        public CustomEnchantPropertiesBuilder addCustomProperty(String key, Object value) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }

        public CustomEnchantPropertiesBuilder setFile(FileConfig file) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }


        public CustomEnchantPropertiesBuilder setLevel(int level) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }

        public CustomEnchantPropertiesBuilder setGlow(boolean glow) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }


        public CustomEnchantPropertiesBuilder setDisplayName(String displayName) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }

        public CustomEnchantPropertiesBuilder setDescription(List<String> description) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }

        public CustomEnchantPropertiesBuilder setMaterial(String material) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }

        public CustomEnchantPropertiesBuilder setMaterial(Material material) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }

        public CustomEnchantPropertiesBuilder setData(int data) {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }


        public CustomEnchantProperties build() {
            throw new IllegalPluginAccessException("PandaGKit has been not found!");
        }
    }
}
