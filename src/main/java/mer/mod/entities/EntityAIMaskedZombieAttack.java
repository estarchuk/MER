package mer.mod.entities;

import net.minecraft.entity.ai.EntityAIAttackMelee;

//This is where mob AI is fine tuned. Not many variables are defined here, but it
//defines the type of attack the entity will do. All the values (damage, speed, etc.)
//are defined in the main "Entity_______.java"

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
