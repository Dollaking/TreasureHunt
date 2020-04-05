package treasurehunt.configuration;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import treasurehunt.TreasureHunt;

import java.io.File;
import java.io.IOException;

public abstract class Configuration {
    private FileConfiguration configFile;
    private String filename;
    private TreasureHunt plugin;
    public Configuration (TreasureHunt plugin){
        this.plugin = plugin;
    }
    public void saveConfig() {
        getPlugin().saveConfig();

    }

    public void reloadConfig() {
        getPlugin().reloadConfig();
        loadConfig();
        saveConfig();
    }

    public abstract void createConfig();

    public abstract void loadConfig();

    public FileConfiguration getConfigFile(){
        return this.configFile;
    }

    public void setConfigFile(FileConfiguration configFile) {
        this.configFile = configFile;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public TreasureHunt getPlugin() {
        return plugin;
    }
}
