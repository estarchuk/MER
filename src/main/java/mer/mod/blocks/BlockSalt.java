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
        super(Material.ROCK);
        setHardness(10);
        setUnlocalizedName(Reference.ModBlocks.SALT.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.SALT.getRegistryName());
        setCreativeTab(MER.CREATIVE_TAB);
    }

    @Nullable

    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return this == ModBlocks.salt ? ModItems.salt :  Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random random) { return this == ModBlocks.salt ? 4 + random.nextInt(6) : 2; }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
}
