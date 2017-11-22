package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;

public class ItemDough extends Item {

    public ItemDough() {
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.DOUGH.getUnlocalizedName());
        setRegistryName(Reference.ModItems.DOUGH.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
