package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;

public class ItemSalt extends Item {

    public ItemSalt() {
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.SALT.getUnlocalizedName());
        setRegistryName(Reference.ModItems.SALT.getRegistryName());
        //Sets the creative tab in which the item appears
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
