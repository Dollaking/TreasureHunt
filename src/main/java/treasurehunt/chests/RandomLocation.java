package treasurehunt.chests;

import org.bukkit.Location;
import org.bukkit.World;
import treasurehunt.configuration.GeneralConfig;

public class RandomLocation {
    private GeneralConfig config;
    public RandomLocation (GeneralConfig config){
        this.config = config;
    }

    public Location findLocation(World world){
        return null;
    }
}
