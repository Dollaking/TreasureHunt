package treasurehunt.configuration;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.bukkit.Location;
import treasurehunt.TreasureHunt;
import treasurehunt.chests.TreasureChest;

import java.util.List;

public class AvailableChestsConfig extends CustomConfiguration{
    private List<String> availableChest;
    public AvailableChestsConfig(TreasureHunt plugin, String name){
        super(plugin, "chests");
    }

    public void loadConfig() {

    }
}
