package mer.mod.blocks;

import mer.mod.MER;
import mer.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTrumpiumBlock extends Block {

    public BlockTrumpiumBlock(){
        //Sets the material of the block eg. air, rock, etc.
        super(Material.ROCK);
        //Sets the hardness of the block, which is how long it takes to break using a pickaxe and other tools
        setHardness(50);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModBlocks.TRUMPIUMBLOCK.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.TRUMPIUMBLOCK.getRegistryName());
        //Sets the creative tab which the block will appear in
        setCreativeTab(MER.CREATIVE_TAB);
    }
}
