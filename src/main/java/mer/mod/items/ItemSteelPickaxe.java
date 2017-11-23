package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemSteelPickaxe extends ItemPickaxe {

    public ItemSteelPickaxe(Item.ToolMaterial material){
        //References the material in ModItems
        super(material);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.STEELPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.STEELPICKAXE.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
