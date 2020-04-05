package treasurehunt.configuration;

import treasurehunt.TreasureHunt;
import treasurehunt.announcements.Announcement;

public class MessageConfig extends CustomConfiguration {
    private Announcement chestFound;
    private Announcement chestDespawned;
    private Announcement chestSpawned;
    //private String help;
    private String noPermission;
    public MessageConfig(TreasureHunt plugin, String name) {
        super(plugin, "message");
    }
    public void loadConfig() {
        chestFound = new Announcement(getConfigFile().getString("chestFound"));
        chestDespawned = new Announcement(getConfigFile().getString("chestDespawned"));
        chestSpawned = new Announcement(getConfigFile().getString("chestSpawned"));
        noPermission = getConfigFile().getString("noPermission");
    }

    public Announcement getChestFound() {
        return chestFound;
    }

    public Announcement getChestDespawned() {
        return chestDespawned;
    }

    public Announcement getChestSpawned() {
        return chestSpawned;
    }

    public String getNoPermission() {
        return noPermission;
    }
}
