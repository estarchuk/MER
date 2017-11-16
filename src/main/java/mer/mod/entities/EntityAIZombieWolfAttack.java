package mer.mod.entities;

import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIZombieWolfAttack extends EntityAIAttackMelee {

    private EntityZombieWolf zombieWolf;

    public EntityAIZombieWolfAttack(EntityZombieWolf zombieIn, double speedIn, boolean longMemoryIn){
        super(zombieIn, speedIn, longMemoryIn);
        this.zombieWolf = zombieIn;
    }

    @Override
    public void startExecuting(){
        super.startExecuting();

    }

    public void resetTask(){
        super.resetTask();
    }

}
