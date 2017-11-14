package mer.mod.entities;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.particle.ParticleMobAppearance;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;


public class RenderBrownZombie extends RenderLiving<EntityBrownZombie> {

    private ResourceLocation mobTexture = new ResourceLocation("mer:textures/entity/brownzombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderBrownZombie(RenderManager renderManagerIn){
        super(renderManagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityBrownZombie entity){
        return mobTexture;
    }

    public static final class Factory implements IRenderFactory<EntityBrownZombie>{
        @Override
        public Render<? super EntityBrownZombie> createRenderFor(RenderManager manager){
            return new RenderBrownZombie(manager);
        }
    }


}
