package mer.mod.items;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.item.ItemFood;

public class ItemButteredToast extends ItemFood {

    public ItemButteredToast() {
        //Because we've made this edible, these values set the following: how much hunger it heals,
        //how much saturation it contains(how long it will heal you for), and whether or not you can feed it to wolves/dogs
        super(6, 0.5F, false);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModItems.BUTTEREDTOAST.getUnlocalizedName());
        setRegistryName(Reference.ModItems.BUTTEREDTOAST.getRegistryName());
        //Sets the creative tab in which the item will appear
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
