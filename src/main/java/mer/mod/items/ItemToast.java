package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.ItemFood;

public class ItemToast extends ItemFood {

    public ItemToast() {
        super(5, 0.3F, false);
        setUnlocalizedName(Reference.ModItems.TOAST.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TOAST.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
