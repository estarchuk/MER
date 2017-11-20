package mer.mod.entities;

import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIMaskedZombieAttack extends EntityAIAttackMelee {

    private int raiseArmsTick;
    private EntityMaskedZombie maskedZombie;

    public EntityAIMaskedZombieAttack(EntityMaskedZombie zombieIn, double speedIn, boolean longMemoryIn){
        super(zombieIn, speedIn, longMemoryIn);
        this.maskedZombie = zombieIn;
    }

    @Override
    public void startExecuting(){
        super.startExecuting();
        this.raiseArmsTick = 0;
    }

    public void resetTask(){
        super.resetTask();
        this.maskedZombie.setArmsRaised(false);
    }

    @Override
    public void updateTask(){
        super.updateTask();
        ++this.raiseArmsTick;

        if (raiseArmsTick >= 5 && this.attackTick < 10){
            this.maskedZombie.setArmsRaised(true);
        }
        else{
            this.maskedZombie.setArmsRaised(false);
        }
    }


}
