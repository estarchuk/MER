package mer.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

    /*
    Like ModCrafting, ModSmelting just registers any new smelting recipes into Minecraft. It is much simpler
    to add smelting recipes, as there is only one input slot, rather than nine.
     */

    public static void register() {
        GameRegistry.addSmelting(Items.BREAD, new ItemStack(ModItems.toast), 4);
    }
}
