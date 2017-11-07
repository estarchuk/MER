package mer.mod.items;

import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemTrumpPickaxe extends ItemPickaxe {

    public ItemTrumpPickaxe(Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(Reference.ModItems.TRUMPPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPPICKAXE.getRegistryName());
    }
}
