package mer.mod.blocks;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.block.material.Material;

public class BlockCement {

    public BlockCement() {
        super(Material.ROCK);

        setUnlocalizedName(Reference.ModBlocks.CEMENT.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CEMENT.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);

        setHardness(20);
    }

}
