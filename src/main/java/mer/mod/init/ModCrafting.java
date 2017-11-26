package mer.mod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    /*
    This is the ModCrafting class. This class tells the main class which crafting recipes to initiate within Minecraft. The way this is laid out is weird, as
    Minecraft uses a 3x3 grid to create the items. The "params" bit of code is what represents the grid. Each set of green double quotes is one row
    of the crafting table. The first set is the top row, the second the middle row, and the third the bottom row.
     */

        public static void register(){
            GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.trumpiumblock), "TTT", "TTT", "TTT", 'T', ModItems.trumpgem);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpsword), " T ", " T ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpaxe), "TT ", "TS ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumppickaxe), "TTT", " S ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpspade), " T ", " S ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumphoe), "TT ", " S ", " S ", 'T', ModBlocks.trumpiumblock, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumphelmet), "TTT", "T T", "   ", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpchestplate),"T T", "TTT", "TTT", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpleggings), "TTT", "T T", "T T", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.trumpboots), "   ", "T T", "T T", 'T', ModBlocks.trumpiumblock);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelsword), " T ", " T ", " S ", 'T', ModItems.steelingot, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelaxe), "TT ", "TS ", " S ", 'T', ModItems.steelingot, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelpickaxe), "TTT", " S ", " S ", 'T', ModItems.steelingot, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelspade), " T ", " S ", " S ", 'T', ModItems.steelingot, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelhoe), "TT ", " S ", " S ", 'T', ModItems.steelingot, 'S', Items.STICK);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelhelmet), "TTT", "T T", "   ", 'T', ModItems.steelingot);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelchestplate),"T T", "TTT", "TTT", 'T', ModItems.steelingot);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelleggings), "TTT", "T T", "T T", 'T', ModItems.steelingot);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.steelboots), "   ", "T T", "T T", 'T', ModItems.steelingot);
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.perogie), "DDD", "SPB", "DDD", 'D', ModItems.dough, 'B', ModItems.butter, 'S', ModItems.salt, 'P', Items.POTATO);
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough), Items.WHEAT, ModItems.salt, Items.WATER_BUCKET);
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.butter), Items.MILK_BUCKET, ModItems.salt);
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.butteredtoast), ModItems.toast, ModItems.butter);
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelpowder), Items.IRON_INGOT, Items.COAL);

        }

}
