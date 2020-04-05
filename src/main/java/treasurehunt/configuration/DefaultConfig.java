package treasurehunt.configuration;

import treasurehunt.TreasureHunt;

import java.util.ArrayList;
import java.util.List;

public class DefaultConfig extends Configuration {
    private int maxX;
    private int minX;
    private int minZ;
    private int maxZ;
    private List<String> worlds;
    private boolean spawnTowny;
    private boolean spawnWorldGuard;

    public DefaultConfig(TreasureHunt plugin){
        super(plugin);
        this.setFilename("config.yml");
        createConfig();
    }


    public void createConfig() {
        getPlugin().saveDefaultConfig();
    }

    public void loadConfig() {
        this.maxX = getConfigFile().getInt("location.maxX");
        this.minX = getConfigFile().getInt(("location.minX"));
        this.maxZ = getConfigFile().getInt("location.maxZ");
        this.minZ = getConfigFile().getInt("location.minZ");
        this.worlds = getConfigFile().getStringList("spawnableWorlds");
        this.spawnTowny = getConfigFile().getBoolean("worldGuard");
        this.spawnWorldGuard = getConfigFile().getBoolean("towny");
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
        this.getConfigFile().set("location.maxX", maxX);
        this.saveConfig();
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
        this.getConfigFile().set("location.maxX", minX);
        this.saveConfig();
    }

    public int getMinZ() {
        return minZ;
    }

    public void setMinZ(int minZ) {
        this.minZ = minZ;
        this.getConfigFile().set("location.maxX", minZ);
        this.saveConfig();
    }

    public int getMaxZ() {
        return maxZ;
    }

    public void setMaxZ(int maxZ) {
        this.maxZ = maxZ;
        this.getConfigFile().set("location.maxX", maxZ);
        this.saveConfig();
    }

    public List<String> getWorlds() {
        return worlds;
    }

    public void addWorld(String world) {
        this.worlds.add(world);
        this.getConfigFile().set("spawnableWorlds", this.worlds);
        this.saveConfig();
    }

    public boolean isSpawnTowny() {
        return spawnTowny;
    }

    public void setSpawnTowny(boolean spawnTowny) {
        this.spawnTowny = spawnTowny;
        this.getConfigFile().set("bannedRegions.towny", spawnTowny);
        this.saveConfig();
    }

    public boolean isSpawnWorldGuard() {
        return spawnWorldGuard;
    }

    public void setSpawnWorldGuard(boolean spawnWorldGuard) {
        this.spawnWorldGuard = spawnWorldGuard;
        this.getConfigFile().set("bannedRegions.worldGuard", spawnWorldGuard);
        this.saveConfig();
    }
}
