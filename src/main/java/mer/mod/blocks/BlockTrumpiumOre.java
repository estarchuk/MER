package mer.mod.blocks;

import mer.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTrumpiumOre extends Block {

    public BlockTrumpiumOre(){
        super(Material.ROCK);
        setHardness(60);
        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMORE.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMORE.getRegistryName());


    }

}
