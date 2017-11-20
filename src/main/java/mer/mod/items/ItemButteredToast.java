package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.ItemFood;

public class ItemButteredToast extends ItemFood {

    public ItemButteredToast() {
        super(6, 0.5F, false);
        setUnlocalizedName(Reference.ModItems.BUTTEREDTOAST.getUnlocalizedName());
        setRegistryName(Reference.ModItems.BUTTEREDTOAST.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
