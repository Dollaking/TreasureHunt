package treasurehunt.chests;

import org.bukkit.Location;
import org.bukkit.World;
import treasurehunt.configuration.DefaultConfig;

public class RandomLocation {
    private DefaultConfig config;
    public RandomLocation (DefaultConfig config){
        this.config = config;
    }

    public Location findLocation(World world){
        return null;
    }
}
