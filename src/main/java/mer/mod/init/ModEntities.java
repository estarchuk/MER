package mer.mod.init;

import mer.mod.MER;
import mer.mod.Reference;
import mer.mod.entities.EntityBrownZombie;
import mer.mod.entities.EntityTrump;
import mer.mod.entities.RenderBrownZombie;
import mer.mod.entities.RenderTrump;
import net.minecraft.entity.Entity;
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

        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation("brownzombie"), EntityBrownZombie.class, Reference.ModEntities.BROWNZOMBIE.getUnlocalizedName(), id++, MER.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.addSpawn(EntityBrownZombie.class, 100, 25, 27, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.DESERT);
        LootTableList.register(EntityBrownZombie.LOOT);
        //
        EntityRegistry.registerModEntity(new ResourceLocation("trump"), EntityTrump.class, Reference.ModEntities.TRUMP.getUnlocalizedName(), id++, MER.instance, 64, 3, true);
        EntityRegistry.addSpawn(EntityTrump.class, 1, 0, 1, EnumCreatureType.MONSTER, Biomes.EXTREME_HILLS);
        LootTableList.register(EntityTrump.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityBrownZombie.class, RenderBrownZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityTrump.class, RenderTrump.FACTORY);
    }
}


