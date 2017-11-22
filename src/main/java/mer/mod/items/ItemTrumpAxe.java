package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemTrumpAxe extends ItemAxe {

    public ItemTrumpAxe(Item.ToolMaterial material, float damage, float speed){
        //Sets damage and speed using the tool material, referenced in ModItems
        super(material, damage, speed);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.TRUMPAXE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPAXE.getRegistryName());
        //Sets the creative tab in which the item appears
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
