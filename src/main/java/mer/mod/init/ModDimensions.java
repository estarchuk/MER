package mer.mod.init;

import mer.mod.MER;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {

    public static DimensionType trumpDimensionType;
    public static final DimensionType TRUMP_DIMENSION = DimensionType.register("TEST", "_test", MER.dimId, WorldProvider.class, false);

    public static void init(){
        registerDimensions();
    }

    private static void registerDimensions(){
        DimensionManager.registerDimension(MER.dimId, TRUMP_DIMENSION);
    }

}
