package mer.mod.init;

import mer.mod.items.ItemTrumpAxe;
import mer.mod.items.ItemTrumpGem;
import mer.mod.items.ItemTrumpHoe;
import mer.mod.items.ItemTrumpSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item.ToolMaterial trumptool = EnumHelper.addToolMaterial("trump", 10, 2000, 15F, 15F, 10);

    public static Item trumpsword;
    public static Item trumpaxe;
    public static Item trumpgem;
    public static Item trumphoe;

    public static void init() {
        trumpsword = new ItemTrumpSword(trumptool);
        trumpaxe = new ItemTrumpAxe(trumptool, 8, 1.2F);
        trumpgem = new ItemTrumpGem();
        trumphoe = new ItemTrumpHoe(trumptool);
    }
    public static void register() {
        GameRegistry.register(trumpsword);
        GameRegistry.register(trumpaxe);
        GameRegistry.register(trumpgem);
        GameRegistry.register(trumphoe);
    }

    public static void registerRenders() {
        registerRender(trumpsword);
        registerRender(trumpaxe);
        registerRender(trumpgem);
        registerRender(trumphoe);
    }


    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}

