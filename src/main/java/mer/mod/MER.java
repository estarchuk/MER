package mer.mod;

import mer.mod.init.ModBlocks;
import mer.mod.init.ModCrafting;
import mer.mod.init.ModItems;
import mer.mod.proxy.CommonProxy;
import mer.mod.world.WorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)

public class MER {

    @Mod.Instance
    public static MER instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static int dimId = 2;

    public static final CreativeTabs CREATIVE_TAB = new MERTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Pre Init");
        ModBlocks.init();
        ModBlocks.register();
        ModItems.init();
        ModItems.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Init");
        proxy.init();
        ModCrafting.register();
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Init");
    }


}
