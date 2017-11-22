package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemTrumpPickaxe extends ItemPickaxe {

    public ItemTrumpPickaxe(Item.ToolMaterial material){
        //References the material in ModItems
        super(material);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.TRUMPPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPPICKAXE.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
