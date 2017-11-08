package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemTrumpChestplate extends ItemArmor{

    public ItemTrumpChestplate(ItemArmor.ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPCHESTPLATE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPCHESTPLATE.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
