package mer.mod.blocks;

import jline.internal.Nullable;
import mer.mod.MER;
import mer.mod.Reference;
import mer.mod.init.ModBlocks;
import mer.mod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockSalt extends Block {

    public BlockSalt(){
        //Sets the material of the block eg. air, rock, etc.
        super(Material.ROCK);
        //Sets the hardness of the block, which is how long it takes to break using a pickaxe and other tools
        setHardness(10);
        //Sets the unlocalized and registry name using data from Reference.class
        setUnlocalizedName(Reference.ModBlocks.SALT.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.SALT.getRegistryName());
        //Sets the creative tab which the block will appear in
        setCreativeTab(MER.CREATIVE_TAB);
    }

    @Nullable
    //Sets the item drop of the block. If this is not in place, the block will just drop itself
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return this == ModBlocks.salt ? ModItems.salt :  Item.getItemFromBlock(this);
    }
    //Sets the amount of the custom item drop
    public int quantityDropped(Random random) { return this == ModBlocks.salt ? 4 + random.nextInt(6) : 2; }
    //This bit will effect how many of the item will be dropped with regards to the fortune enchantment
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
}
