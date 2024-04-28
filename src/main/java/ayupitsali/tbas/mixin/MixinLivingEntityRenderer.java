package ayupitsali.tbas.mixin;

import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LivingEntityRenderer.class)
public class MixinLivingEntityRenderer {
    /**
     * @author AyUpItsAli
     * @reason Always return as if the entity is not hurt (disabling the red tint overlay)
     */
    @Overwrite
    public static int getOverlayCoords(LivingEntity pLivingEntity, float pU) {
        return OverlayTexture.pack(pU, false);
    }
}
