package mer.mod.proxy;

import mer.mod.init.ModBlocks;
import mer.mod.init.ModEntities;
import mer.mod.init.ModItems;

public class ClientProxy implements CommonProxy {

    /*
    This class doesn't do much besides initializing renders. Extends off the "Common Proxy", which is where the main init command exists
     */

    @Override
    public void init() {
        ModBlocks.registerRenders();
        ModItems.registerRenders();
}}
