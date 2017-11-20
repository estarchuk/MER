package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.ItemFood;

public class ItemButter extends ItemFood {

    public ItemButter() {
        super(1, 0.0F, false);
        setUnlocalizedName(Reference.ModItems.BUTTER.getUnlocalizedName());
        setRegistryName(Reference.ModItems.BUTTER.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
