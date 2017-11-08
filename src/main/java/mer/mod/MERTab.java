package mer.mod;

import mer.mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MERTab extends CreativeTabs {

    public MERTab(){
        super("tabMER");
    }

    @Override
    public  ItemStack getTabIconItem() {
        return new ItemStack(ModItems.trumpgem);
    }
}
