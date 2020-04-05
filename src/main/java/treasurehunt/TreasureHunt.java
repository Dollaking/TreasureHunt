package treasurehunt;

import org.bukkit.plugin.java.JavaPlugin;
import treasurehunt.configuration.*;

public class TreasureHunt extends JavaPlugin {
    private DefaultConfig defaultConfig;
    private RewardsConfig rewardConfig;
    private MessageConfig messageConfig;
    private AvailableChestsConfig avaliableChestConfig;
    private TopPlayerConfig topPlayerConfig;

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable(){

    }

    private int generateId(){
        return 0;
    }

    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(DefaultConfig defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    public RewardsConfig getRewardConfig() {
        return rewardConfig;
    }

    public void setRewardConfig(RewardsConfig rewardConfig) {
        this.rewardConfig = rewardConfig;
    }

    public MessageConfig getMessageConfig() {
        return messageConfig;
    }

    public void setMessageConfig(MessageConfig messageConfig) {
        this.messageConfig = messageConfig;
    }

    public AvailableChestsConfig getAvaliableChestConfig() {
        return avaliableChestConfig;
    }

    public void setAvaliableChestConfig(AvailableChestsConfig avaliableChestConfig) {
        this.avaliableChestConfig = avaliableChestConfig;
    }

    public TopPlayerConfig getTopPlayerConfig() {
        return topPlayerConfig;
    }

    public void setTopPlayerConfig(TopPlayerConfig topPlayerConfig) {
        this.topPlayerConfig = topPlayerConfig;
    }
}
