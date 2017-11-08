package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ItemTrumpHoe extends ItemHoe{

    public ItemTrumpHoe (Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPHOE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPHOE.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
