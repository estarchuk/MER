package mer.mod;

import mer.mod.init.*;
import mer.mod.proxy.CommonProxy;
import mer.mod.world.WorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)

public class MER {

    /*
    This is the main mod file. Despite basically tying everything, there is not a lot of code in here.
    Normally just initializes stuff like models, crafting, entities, items, blocks, etc.
     */

    @Mod.Instance
    public static MER instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs CREATIVE_TAB = new MERTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Pre Init");
        ModBlocks.init();
        ModBlocks.register();
        ModItems.init();
        ModItems.register();
        ModEntities.init();
        ModEntities.initModels();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Init");
        proxy.init();
        ModCrafting.register();
        ModSmelting.register();
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Init");
    }


}
