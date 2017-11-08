package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemTrumpSpade extends ItemSpade{

    public ItemTrumpSpade (Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPSPADE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPSPADE.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
