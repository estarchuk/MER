package mer.mod.items;

import net.minecraft.item.ItemArmor;

public class ItemTrumpChestplate extends ItemArmor{

    public ItemTrumpChestplate(ItemArmor.ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPCHESTPLATE.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPCHESTPLATE.getRegistryName());
    }
}
