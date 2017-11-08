package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemTrumpHelmet extends ItemArmor {

    public ItemTrumpHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn){
        super(material, renderIndex, equipmentSlotIn);
        setUnlocalizedName(Reference.ModItems.TRUMPHELMET.getUnlocalizedName());
        setRegistryName(Reference.ModItems.TRUMPHELMET.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
