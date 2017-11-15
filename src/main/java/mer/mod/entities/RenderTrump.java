package mer.mod.entities;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;


public class RenderTrump extends RenderLiving<EntityBrownZombie> {

    private ResourceLocation mobTexture = new ResourceLocation("mer:textures/entity/trump.png");

    public static final Factory FACTORY = new Factory();

    public RenderTrump(RenderManager renderManagerIn){
        super(renderManagerIn, new ModelPlayer(2.0F, true), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityBrownZombie entity){
        return mobTexture;
    }

    public static final class Factory implements IRenderFactory<EntityBrownZombie>{
        @Override
        public Render<? super EntityBrownZombie> createRenderFor(RenderManager manager){
            return new RenderTrump(manager);
        }
    }


}
