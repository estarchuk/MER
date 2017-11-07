package mer.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register(){
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpsword), " T ", " T ", " S ", 'T', ModItems.trumpgem, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpaxe), "TT ", "TS ", " S ", 'T', ModItems.trumpgem, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpboots), "", "T T", "T T", 'T', ModItems.trumpgem);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpchestplate),"T T", "TTT", "TTT", 'T', ModItems.trumpgem);
    }
}
