package mer.mod.entities;

import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIBrownZombieAttack extends EntityAIAttackMelee {

    private int raiseArmsTick;
    private EntityBrownZombie brownZombie;

    public EntityAIBrownZombieAttack(EntityBrownZombie zombieIn, double speedIn, boolean longMemoryIn){
        super(zombieIn, speedIn, longMemoryIn);
        this.brownZombie = zombieIn;
    }

    @Override
    public void startExecuting(){
        super.startExecuting();
        this.raiseArmsTick = 0;
    }

    public void resetTask(){
        super.resetTask();
        this.brownZombie.setArmsRaised(false);
    }

    @Override
    public void updateTask(){
        super.updateTask();
        ++this.raiseArmsTick;

        if (raiseArmsTick >= 5 && this.attackTick < 10){
            this.brownZombie.setArmsRaised(true);
        }
        else{
            this.brownZombie.setArmsRaised(false);
        }
    }


}
