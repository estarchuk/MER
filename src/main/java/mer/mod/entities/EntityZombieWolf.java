package mer.mod.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityZombieWolf extends EntityWolf {
        /*
    Here is one of the main attractions: a new mob in Minecraft. This mob was one that we made on our own, using nothing
    but human intuition and the tutorial mob as reference. And hey, it works! This one has a broken model but we could not,
    despite valiant efforts, find a fix for it. But that's ok. It's a feature now.
     */


    public static final ResourceLocation LOOT = new ResourceLocation("mer:entities/zombiewolf");

    public EntityZombieWolf(World worldin){
        super(worldin);
    }

    //This decides how big the mob will be when it spawns in, and that it will spawn in the same world as the player

    @Override
    protected void entityInit(){
        super.entityInit();
    }

    // This above bit initiates the entity, bringing it too life (as long as it is initiated in the proxy)


    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        // Here we set various attributes for our mob. Like maximum health, armor, speed, ...
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.5D);
    }

    @Override
    protected void initEntityAI() {
        //This sets up the mobs AI, such as how it will wander around, swim, attack, etc.
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(1, new EntityAIZombieWolfAttack(this, 1.0D, false));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    private void applyEntityAI() {
        //This bit sets up what the mob will attack and how it will react when attacked.
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySheep.class, true));
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
    //This points to the loot table for the "ModEntities.java" class to use when initiating the mob


    @Override
    public int getMaxSpawnedInChunk() {
        return 8;
    }
    //This sets how many mobs can spawn per "chunk" (16 x 16 x 256 blocks)

}
