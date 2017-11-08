package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemTrumpAxe extends ItemAxe {

    public ItemTrumpAxe(Item.ToolMaterial material, float damage, float speed){
        super(material, damage, speed);
        setUnlocalizedName(Reference.ModItems.TRUMPAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPAXE.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
