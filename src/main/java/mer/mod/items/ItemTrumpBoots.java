package mer.mod.items;

import net.minecraft.item.ItemArmor;

public class ItemTrumpBoots extends ItemArmor{
    public ItemTrumpBoots(ItemArmor.ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPBOOTS.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPBOOTS.getRegistryName());
    }
}
