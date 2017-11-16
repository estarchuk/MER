package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;

public class ItemSalt extends Item {

    public ItemSalt() {
        setUnlocalizedName(Reference.ModItems.SALT.getUnlocalizedName());
        setRegistryName(Reference.ModItems.SALT.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
