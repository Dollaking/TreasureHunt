package treasurehunt.rewards;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemRewards extends Rewards{

    private ItemStack items;
    public ItemRewards(ItemStack items){
        this.items = items;
    }
    public void giveRewards(Player player) {

    }
}
