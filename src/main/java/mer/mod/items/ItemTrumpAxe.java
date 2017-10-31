package mer.mod.items;

import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemTrumpAxe extends ItemAxe {

    public ItemTrumpAxe(Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPAXE.getRegistryName());
    }
}
