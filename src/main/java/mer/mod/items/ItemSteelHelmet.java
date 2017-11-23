package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemSteelHelmet extends ItemArmor {

    public ItemSteelHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        //References ModItems to determine where on the player's body it gets equipped, and how its rendered
        super(material, renderIndex, equipmentSlotIn);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.STEELHELMET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.STEELHELMET.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
