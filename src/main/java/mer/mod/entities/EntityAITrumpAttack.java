package mer.mod.entities;

import net.minecraft.entity.ai.EntityAIAttackMelee;

//This is where mob AI is fine tuned. Not many variables are defined here, but it
//defines the type of attack the entity will do. All the values (damage, speed, etc.)
//are defined in the main "Entity_______.java"

public class EntityAITrumpAttack extends EntityAIAttackMelee {

    private EntityTrump entityTrump;

    public EntityAITrumpAttack(EntityTrump trumpIn, double speedIn, boolean longMemoryIn){
        super(trumpIn, speedIn, longMemoryIn);
        this.entityTrump = trumpIn;
    }

    @Override
    public void startExecuting(){
        super.startExecuting();
    }

    public void resetTask(){
        super.resetTask();
    }
}
