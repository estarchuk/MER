package mer.mod.blocks;

import mer.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTrumpiumBlock extends Block {

    public BlockTrumpiumBlock(){
        super(Material.ROCK);
        setHardness(50);
        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMBLOCK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMBLOCK.getRegistryName());
    }
}
