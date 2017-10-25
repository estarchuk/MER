package mer.mod.proxy;

public class ClientProxy {

    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
}}
