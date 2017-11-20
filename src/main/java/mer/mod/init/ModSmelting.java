package mer.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
    public static void register() {
        GameRegistry.addSmelting(Items.BREAD, new ItemStack(ModItems.toast), 4);
    }
}
