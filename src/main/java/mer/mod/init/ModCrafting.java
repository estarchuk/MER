package mer.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register(){
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpsword), " T ", " T ", " S ", 'T', ModItems.trumpgem, 'S', Items.STICK);
    }


}
