package treasurehunt.configuration;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import sun.security.krb5.Config;
import treasurehunt.TreasureHunt;

import java.io.File;
import java.io.IOException;

public abstract class CustomConfiguration extends Configuration {
    private String filename;
    private FileConfiguration customConfig;

    public CustomConfiguration (TreasureHunt plugin, String name){
        super(plugin);
        this.filename = name;
        createConfig();
    }

    @Override
    public void saveConfig() {
        this.getPlugin().saveResource(filename + ".yml", false);

    }

    public void reloadConfig() {
        createConfig();
        loadConfig();
        saveConfig();
    }

    @Override
    public void createConfig() {
        File file = new File(getPlugin().getDataFolder(), this.filename + ".yml");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            getPlugin().saveResource(this.filename + ".yml", false);
        }

        FileConfiguration config = new YamlConfiguration();
        try {
            config.load(file);
            this.customConfig = config;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public abstract void loadConfig();

    public FileConfiguration getCustomConfig(){
        return this.customConfig;
    }
}
