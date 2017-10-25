package mer.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MERTab extends CreativeTabs {

    public MERTab(){
        super("tabMer");
    }

    @Override
    public Item getTabIconItem() {
        return Items.APPLE;
    }

}
