package mer.mod.entities;

import net.minecraft.entity.ai.EntityAIAttackMelee;

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
