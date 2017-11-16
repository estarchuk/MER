package mer.mod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

        public static void register(){GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpsword), " T ", " T ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpaxe), "TT ", "TS ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpboots), "   ", "T T", "T T", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpchestplate),"T T", "TTT", "TTT", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpleggings), "TTT", "T T", "T T", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumphelmet), "TTT", "T T", "   ", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumppickaxe), "TTT", " S ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumphoe), "TT ", " S ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpspade), " T ", " S ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough), Items.WHEAT, ModItems.salt, Items.WATER_BUCKET);
        }

}
