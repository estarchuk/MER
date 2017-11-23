package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {

    public ItemSteelIngot() {
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.STEELINGOT.getUnlocalizedName());
        setRegistryName(Reference.ModItems.STEELINGOT.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
