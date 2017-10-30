package mer.mod.blocks;

import mer.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCement extends Block {

    public BlockCement(){
        super(Material.ROCK);

        setUnlocalizedName(Reference.ModBlocks.CEMENT.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.CEMENT.getRegistryName());


    }

}
