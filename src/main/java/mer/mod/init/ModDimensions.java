package mer.mod.init;

import mer.mod.MER;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class ModDimensions {

    public static DimensionType trumpDimensionType;
    public static final DimensionType TRUMP_DIMENSION = DimensionType.register("TEST", "_test", MER.dimId, WorldProvider.class, false);

}
