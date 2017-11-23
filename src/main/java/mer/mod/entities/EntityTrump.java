package mer.mod.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;


import javax.annotation.Nullable;

public class EntityTrump extends EntityMob {

    /*
    Here is one of the main attractions: a new mob in Minecraft. This one was really a test run to see if we could get a
    mob working properly, so this is similar to a mob found on the internet. However, we did manage to gain understanding of why this
    stuff works.
     */

    public static final ResourceLocation LOOT = new ResourceLocation("mer:entities/trump");

    //This points to the loot table, which is stored in resources.

    public EntityTrump(World worldin){
        super(worldin);
        setSize(0.6F, 1.95F);
    }

    //This decides how big the mob will be when it spawns in, and that it will spawn in the same world as the player

    @Override
    protected void entityInit() {
        super.entityInit();
    }

    //This above bit initiates the entity, bringing it too life (as long as it is initiated in the proxy)

    @Override
    protected void applyEntityAttributes() {
        // Here we set various attributes for our mob. Like maximum health, armor, speed, ...
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(250.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(10.D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(55.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(35.0D);
    }


    @Override
    protected void initEntityAI() {
        //This sets up the mobs AI, such as how it will wander around, swim, attack, etc.
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAITrumpAttack(this, 3.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 5.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    private void applyEntityAI() {
        //This bit sets up what the mob will attack and how it will react when attacked.
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }


    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
    //This points to the loot table for the "ModEntities.java" class to use when initiating the mob

    @Override
    protected boolean isValidLightLevel() {
        return true;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 1;
    }
    //This sets how many mobs can spawn per "chunk" (16 x 16 x 256 blocks)





}
