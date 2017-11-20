package mer.mod.entities;

import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderZombieWolf extends RenderLiving<EntityZombieWolf> {

    private ResourceLocation mobTexture = new ResourceLocation("mer:textures/entity/zombiewolf.png");

    public static final Factory FACTORY = new Factory();

    public RenderZombieWolf(RenderManager renderManagerIn){
        super(renderManagerIn, new ModelWolf(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityZombieWolf entity){
        return mobTexture;
    }

    public static final class Factory implements IRenderFactory<EntityZombieWolf> {
        @Override
        public Render<? super EntityZombieWolf> createRenderFor(RenderManager manager){
            return new RenderZombieWolf(manager);
        }
    }


}
