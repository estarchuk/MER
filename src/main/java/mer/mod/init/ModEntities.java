package mer.mod.init;

import mer.mod.MER;
import mer.mod.Reference;
import mer.mod.entities.*;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init(){

        //This bit of the ModEntities is what registers the Entity into Minecraft, and sets stuff like spawning and loot drops up.

        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation("mer:maskedzombie"), EntityMaskedZombie.class, Reference.ModEntities.MASKEDZOMBIE.getUnlocalizedName(), id++, MER.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.addSpawn(EntityMaskedZombie.class, 100, 25, 27, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.DESERT);
        LootTableList.register(EntityMaskedZombie.LOOT);
        //
        EntityRegistry.registerModEntity(new ResourceLocation("mer:trump"), EntityTrump.class, Reference.ModEntities.TRUMP.getUnlocalizedName(), id++, MER.instance, 64, 3, true);
        EntityRegistry.addSpawn(EntityTrump.class, 1, 0, 1, EnumCreatureType.MONSTER, Biomes.EXTREME_HILLS);
        LootTableList.register(EntityTrump.LOOT);
        //
        EntityRegistry.registerModEntity(new ResourceLocation("mer:zombiewolf"), EntityZombieWolf.class, Reference.ModEntities.ZOMBIEWOLF.getUnlocalizedName(), id++, MER.instance, 64, 3, true);
        EntityRegistry.addSpawn(EntityZombieWolf.class, 100, 2, 5, EnumCreatureType.AMBIENT, Biomes.FOREST);
        LootTableList.register(EntityZombieWolf.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        //This part just initializes the models for each entity into Minecraft.

        RenderingRegistry.registerEntityRenderingHandler(EntityMaskedZombie.class, RenderMaskedZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityTrump.class, RenderTrump.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieWolf.class, RenderZombieWolf.FACTORY);
    }
}


