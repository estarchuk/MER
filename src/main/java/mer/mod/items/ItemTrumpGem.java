package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTrumpGem extends Item {

    public ItemTrumpGem() {
        setUnlocalizedName(Reference.ModItems.TRUMPGEM.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPGEM.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
