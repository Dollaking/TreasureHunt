package treasurehunt.chests;

import org.bukkit.Location;
import treasurehunt.rewards.Rewards;

import java.util.ArrayList;

public class TreasureChest {
    ArrayList<Rewards> reward;
    Location location;
    int id;

    public TreasureChest (int id, ArrayList<Rewards>rewards, Location location){
        this.reward = rewards;
        this.location = location;
        this.id = id;
    }

    public void spawnTreasure(){

    }
}
