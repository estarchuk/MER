package mer.mod.entities;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

//Here is where the entities models are defined and some boundaries are defined
//like model width, size, shadow, etc. Normally extends an already existing mob model
//in Minecraft

public class RenderMaskedZombie extends RenderLiving<EntityMaskedZombie> {

    private ResourceLocation mobTexture = new ResourceLocation("mer:textures/entity/maskedzombie.png");

    public static final Factory FACTORY = new Factory();

    public RenderMaskedZombie(RenderManager renderManagerIn){
        super(renderManagerIn, new ModelZombie(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityMaskedZombie entity){
        return mobTexture;
    }

    public static final class Factory implements IRenderFactory<EntityMaskedZombie>{
        @Override
        public Render<? super EntityMaskedZombie> createRenderFor(RenderManager manager){
            return new RenderMaskedZombie(manager);
        }
    }


}
