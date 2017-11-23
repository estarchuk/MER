package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;

public class ItemSteelPowder extends Item {

    public ItemSteelPowder() {
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.STEELPOWDER.getUnlocalizedName());
        setRegistryName(Reference.ModItems.STEELPOWDER.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
