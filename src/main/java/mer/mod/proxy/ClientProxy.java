package mer.mod.proxy;

import mer.mod.init.ModBlocks;

public class ClientProxy implements CommonProxy {

    @Override
    public void init() {
        ModBlocks.registerRenders();
}}
