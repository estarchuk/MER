package mer.mod.proxy;

import mer.mod.init.ModBlocks;
import mer.mod.init.ModItems;

public class ClientProxy implements CommonProxy {

    @Override
    public void init() {
        ModBlocks.registerRenders();
        ModItems.registerRenders();
}}
