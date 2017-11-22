package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTrumpGem extends Item {

    public ItemTrumpGem() {
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.TRUMPGEM.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPGEM.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
